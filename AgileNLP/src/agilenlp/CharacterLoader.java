/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilenlp;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author bdoyle
 */
public class CharacterLoader {
    public ArrayList<Character> CharactersArrayList;
    public ArrayList<Character> CharactersIDArrayList;
    public Hashtable CharactersHashtable;
    
    public CharacterLoader()
    {
        CharactersArrayList = new ArrayList();
        CharactersIDArrayList = new ArrayList();
        CharactersHashtable = new Hashtable();
        
    }

    public void Add(Character c)
    {
        if(c.freebase_character_id != "" &&  c.wikipedia_movie_id != "")
        {
            Character c_id = new Character();
            c_id.wikipedia_movie_id = c.wikipedia_movie_id;
            c_id.freebase_character_id = c.freebase_character_id;
            CharactersIDArrayList.add(c_id);

            CharactersArrayList.add(c);
            CharactersHashtable.put(c.freebase_character_id, c);
        }
    }
}
