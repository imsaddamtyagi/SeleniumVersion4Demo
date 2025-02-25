package org.com.coreJava;

import java.util.HashMap;

public class DuplicateElement_String 
{
    public static void main(String[] args) 
    {
        String str = "My name is khan";
        
        char[] arr = str.toCharArray();
        
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
             
        for (char c : arr)
        {
            if (hm.containsKey(c)) 
            {
            	hm.put(c, hm.get(c) + 1); //increment key value to 1  
            } 
            else 
            {
            	hm.put(c, 1);
            }
        }
        
        
        System.out.println("Duplicate characters:");
        
        for (HashMap.Entry<Character, Integer> entry : hm.entrySet()) 
        {
            if (entry.getValue() > 1)
            {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
