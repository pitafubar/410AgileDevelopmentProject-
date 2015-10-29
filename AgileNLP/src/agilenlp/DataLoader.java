/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilenlp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DataLoader {
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

    public static ArrayList GetCharacter()
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
