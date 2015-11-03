
package agilenlp;

/*
PURPOSE:    THE MOVIE CLASS REPRESENTS ALL FIELDS LOADED VIA MOVIE TSV FILE

NOTES:      CONSTRUCTOR TAKES STRING ARRAY WHICH REPRESENTS SINGLE LINE FROM TSV FILE 

DATA EXAMPLE
975900	/m/03vyhn	Ghosts of Mars	2001-08-24	14010832	98.0	{"/m/02h40lc": "English Language"}	{"/m/09c7w0": "United States of America"}	{"/m/01jfsb": "Thriller", "/m/06n90": "Science Fiction", "/m/03npn": "Horror", "/m/03k9fj": "Adventure", "/m/0fdjb": "Supernatural", "/m/02kdv5l": "Action", "/m/09zvmj": "Space western"}
*/



public class Movie {
    public String wikipedia_movie_id = "";
    public String freebase_movie_id = "";
    public String movie_name = "";
    public String release_date = "";
    public String box_office_revenue = "";
    public String runtime = "";
    
        
    public Movie (String [] string_array)
    {
    //languages
    //countries
    //genres
        if(string_array.length == 9)
        {
            wikipedia_movie_id = string_array[0];
            freebase_movie_id = string_array[1];
            movie_name = string_array[2];
            release_date = string_array[3];
            box_office_revenue = string_array[4];
            runtime = string_array[5];
        }
        
    }
}
