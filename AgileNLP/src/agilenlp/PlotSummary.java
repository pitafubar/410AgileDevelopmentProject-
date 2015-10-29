/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilenlp;

/*
WHAT THE LINE LOOKS LIKE IN FILE
975900	/m/03vyhn	Ghosts of Mars	2001-08-24	14010832	98.0	{"/m/02h40lc": "English Language"}	{"/m/09c7w0": "United States of America"}	{"/m/01jfsb": "Thriller", "/m/06n90": "Science Fiction", "/m/03npn": "Horror", "/m/03k9fj": "Adventure", "/m/0fdjb": "Supernatural", "/m/02kdv5l": "Action", "/m/09zvmj": "Space western"}
*/
public class PlotSummary {
    public String wikipedia_movie_id;
    public String summary;
    
        
    public PlotSummary (String [] string_array)
    {
    //languages
    //countries
    //genres
        if(string_array.length == 2)
        {
            wikipedia_movie_id = string_array[0];
            summary = string_array[1];
        }
        
    }
}
