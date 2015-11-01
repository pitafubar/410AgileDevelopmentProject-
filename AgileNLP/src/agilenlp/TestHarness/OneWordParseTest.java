/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilenlp.TestHarness;

import agilenlp.DataLoader;
import agilenlp.Movie;
import java.util.ArrayList;
import java.util.Scanner;

public class OneWordParseTest {

    public static void main(String[] args) {
        
    }

    public ArrayList<String> parseOneWord() {
        ArrayList<Movie> movies = DataLoader.GetMovies();
        ArrayList<String> descriptions = DataLoader.GetPlotSummaries();
        ArrayList<String> titles = new ArrayList<>();
        for (Movie m : movies) {
            titles.add(m.movie_name);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Type a keyword to query");
        String query = input.next();

        ArrayList<String> parsedTitles = new ArrayList<>();

        for (String s : descriptions) {
            if (s.equalsIgnoreCase(query)) {
                int index = descriptions.indexOf(s) - 1;
                parsedTitles.add(descriptions.get(index));
            }
        }

        return parsedTitles;

    }
}
