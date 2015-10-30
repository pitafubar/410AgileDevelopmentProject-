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


public class DataAggregator {
    
}
