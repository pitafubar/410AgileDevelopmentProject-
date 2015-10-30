/*
PURPOSE:    DataLoader is a simple class that exposes static methods that return array lists of entity objects
            which represent a single line read in from each entities TSV file.
            All this class does is loop over a given entity file line by line, pass the line into the constuctor
            for that entity (i.e. a movie, character, etc.) which returns the entity as an object, and then loads it into
            an array list.  The array list is then populated with that object.  Once the file is completely read and loadeded
            into an array list of entities, the array list is returned.

*/

package agilenlp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DataLoader {
 
    //GetMovies loads all Movies from movie.tsv and returns an array list of movie objects
    public static ArrayList GetMovies()
    {
        ArrayList a = new ArrayList();
        InputStream input_stream = DataLoader.class.getResourceAsStream("/resources/movie.metadata.tsv");    
        BufferedReader reader = new BufferedReader(new InputStreamReader(input_stream));
        String read_line;
        String temp [];
        
        try
        {
            while ((read_line = reader.readLine()) != null)
            {
                temp = read_line.split("\t");

                if(temp.length == 9)
                {
                    Movie m = new Movie(temp);
                    a.add(m);
                }
            }
        }
        catch (Exception ex)
        {
            //TODO: NOT DEALING WITH EXCEPTIONS RIGHT NOW
        }

        return a;
        
    }
    
    
    //GetPlotSummaries loads all PlotSummaries from the plot summary.tsv and returns an array list of plot summary objects
    public static ArrayList GetPlotSummaries()
    {
        ArrayList a = new ArrayList();
        InputStream input_stream = DataLoader.class.getResourceAsStream("/resources/plot_summaries.txt");    
        BufferedReader reader = new BufferedReader(new InputStreamReader(input_stream));
        String read_line;
        String temp [];
        
        try
        {
            while ((read_line = reader.readLine()) != null)
            {
                temp = read_line.split("\t");

                if(temp.length == 2)
                {
                    PlotSummary ps = new PlotSummary(temp);
                    a.add(ps);
                }
            }
        }
        catch (Exception ex)
        {
            //TODO: NOT DEALING WITH EXCEPTIONS RIGHT NOW
        }

        return a;
        
    }

    
    //GetCharacters loads all Characters from character.tsv and returns an array list of character objects
    public static ArrayList GetCharacters()
    {
        ArrayList a = new ArrayList();
        InputStream input_stream = DataLoader.class.getResourceAsStream("/resources/character.metadata.tsv");    
        BufferedReader reader = new BufferedReader(new InputStreamReader(input_stream));
        String read_line;
        String temp [];
        
        try
        {
            while ((read_line = reader.readLine()) != null)
            {
                temp = read_line.split("\t");

                if(temp.length == 13)
                {
                    Movie m = new Movie(temp);
                    a.add(m);
                }
            }
        }
        catch (Exception ex)
        {
            //TODO: NOT DEALING WITH EXCEPTIONS RIGHT NOW
        }

        return a;
        
    }
    

    //GetNameClusters loads all NameClusters from the name cluster text file and returns an array list of name cluster objects
    public static ArrayList GetNameClusters()
    {
        ArrayList a = new ArrayList();
        InputStream input_stream = DataLoader.class.getResourceAsStream("/resources/name.clusters.txt");    
        BufferedReader reader = new BufferedReader(new InputStreamReader(input_stream));
        String read_line;
        String temp [];
        
        try
        {
            while ((read_line = reader.readLine()) != null)
            {
                temp = read_line.split("\t");

                if(temp.length == 2)
                {
                    NameCluster ps = new NameCluster(temp);
                    a.add(ps);
                }
            }
        }
        catch (Exception ex)
        {
            //TODO: NOT DEALING WITH EXCEPTIONS RIGHT NOW
        }

        return a;
        
    }
    
}
