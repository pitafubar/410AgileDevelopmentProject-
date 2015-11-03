/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilenlp.TestHarness;

import agilenlp.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OneWordParseTest {

    public static void main(String[] args) {
        ArrayList<MovieComposite> selectedMovies = parseOneWord();
        for(MovieComposite m: selectedMovies )
        {
            System.out.print("Movies are: " +m.movie.movie_name+",");   
        }
    }

    public static ArrayList<MovieComposite> parseOneWord() {
        ArrayList<MovieComposite> movies = DataAggregator.GetCompositeMovies();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Type a keyword to query");
        String query = input.next();

        ArrayList<MovieComposite> parsedTitles = new ArrayList<>();
        
        for(MovieComposite m: movies)
        {
            if(m.plot_summary.summary.toLowerCase().contains(query))
            {
                parsedTitles.add(m);
            }
            else if(m.movie.movie_name.toLowerCase().contains(query))
            {
                parsedTitles.add(m);
            }
        }
        return parsedTitles;

    }
}
