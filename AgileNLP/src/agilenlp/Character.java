/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilenlp;


public class Character {
    public String wikipedia_movie_id;
    public String freebase_movie_id;
    public String release_date;
    public String character_name;
    public String actor_dob;
    public String actor_gender;
    public String actor_height_in_meters;
    public String actor_ethnicity;
    public String actor_name;
    public String actor_age_at_movie_release;
    public String freebase_character_actor_map_id;
    public String freebase_character_id;
    public String freebase_actor_id;
    
        
    public Character (String [] string_array)
    {
    //languages
    //countries
    //genres
        if(string_array.length == 13)
        {
            wikipedia_movie_id = string_array[0];
            freebase_movie_id = string_array[1];
            release_date = string_array[2];
            character_name = string_array[3];
            actor_dob = string_array[4];
            actor_gender = string_array[5];
            actor_height_in_meters = string_array[6];
            actor_ethnicity = string_array[7];
            actor_name = string_array[8];
            actor_age_at_movie_release = string_array[9];
            freebase_character_actor_map_id = string_array[10];
            freebase_character_id = string_array[11];
            freebase_actor_id = string_array[12];
        }
        
    }
}

