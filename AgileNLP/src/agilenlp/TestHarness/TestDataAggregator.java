/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilenlp.TestHarness;

import agilenlp.DataAggregator;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bdoyle
 */
public class TestDataAggregator {
    public static void run()
    {
        Date start_time;
        Date end_time;

        start_time = new Date();
        System.out.println("Start Time: " + start_time);
        ArrayList composite_movies = DataAggregator.GetCompositeMovies();
        end_time = new Date();

        //debugging code
        System.out.println("Movie Array Size: " + composite_movies.size());
        System.out.println("End Time: " + end_time);
        
    }
    
}
