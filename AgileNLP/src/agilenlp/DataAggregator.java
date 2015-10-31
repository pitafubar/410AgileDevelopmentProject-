/*
PURPOSE:    DataAggregator is going to load all the data and then merge the data together into a single
            Entity that can be used for searching.
            Thinking about the idea of hashing at this juncture as well, but need to give that some thought.

            The idea behind it is movie will be merged with plot summary, and perhaps a list of character names for the movie, genres, etc.  
            So one object will contain ALL data merged together.
            
            The dataagregator will be responsible for this.
            The entity MovieComposite will be the object that contains all this data together.

            Lastly, the idea is that our main program will call into DataAggregator, return an array of MovieComposite objects.
            DataAggregator will call each loader function from DataLoader, and do it's magic munging together.
*/


package agilenlp;

import java.util.ArrayList;


public class DataAggregator {
    public static ArrayList GetCompositeMovies()
    {
        ArrayList<Movie> movies = DataLoader.GetMovies();
        ArrayList<Character> characters = DataLoader.GetCharacters();
        ArrayList<PlotSummary> plot_summaries = DataLoader.GetPlotSummaries();
        ArrayList<MovieComposite> composite_movies = new ArrayList();
        
        for(Movie m: movies)
        {
            MovieComposite mc = new MovieComposite();
            mc.movie = m;
            
            //find the plot summary;
            for(PlotSummary ps: plot_summaries)
            {
                if(ps.wikipedia_movie_id == m.wikipedia_movie_id)
                {
                    mc.plot_summary = ps;
                }
            }
            
            for(Character c: characters)
            {
                if(c.wikipedia_movie_id == m.wikipedia_movie_id)
                {
                    mc.characters.add(c);
                }
            }

            composite_movies.add(mc);
        }
        //get all the characters for the movie and put into an array list
        
        return composite_movies;
    }
}
