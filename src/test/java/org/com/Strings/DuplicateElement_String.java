package org.com.Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement_String {
	
    public static void main(String[] args) {
    	
        String str = "Lakkad de dunga bhen ke lode";

        char arr[] = str.toCharArray();

        HashMap<Character, Integer> MyHashMap = new HashMap<>();

        for(char ch : arr)
        {      	
        	if(MyHashMap.containsKey(ch))
        	{
        	   MyHashMap.put(ch, MyHashMap.get(ch)+1);
        	}
        	else
        	{
        	   MyHashMap.put(ch,1);
        	}
        	
        }
        
        
    
        for (Map.Entry<Character, Integer> entry : MyHashMap.entrySet()) 
        {
      
                System.out.println(entry.getKey() + " : " + entry.getValue());
         
            
        }
    }
}