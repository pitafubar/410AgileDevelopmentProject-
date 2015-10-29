/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilenlp;

public class NameCluster {
    public String character_name;
    public String freebase_character_id;
    
        
    public NameCluster (String [] string_array)
    {

        if(string_array.length == 2)
        {
            character_name = string_array[0];
            freebase_character_id = string_array[1];
        }
        
    }
}
