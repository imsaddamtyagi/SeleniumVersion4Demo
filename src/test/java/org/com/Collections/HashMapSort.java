package org.com.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapSort {
	
    public static void main(String[] args) {
    	
    HashMap<String,Integer> MyHashMap = new HashMap<>();
                            MyHashMap.put("Bambe",3);
                            MyHashMap.put("Bo",4);
                            MyHashMap.put("Akkad",1);
                            MyHashMap.put("Bkkad",2);
   
     List<Map.Entry<String,Integer>> MyList = new ArrayList<>(MyHashMap.entrySet());
     
     MyList.sort((Entry1,Entry2)-> Entry1.getValue().compareTo(Entry2.getValue()));
     
     
    LinkedHashMap<String,Integer> MyLinkedHashMap = new  LinkedHashMap<>();
    
    
    for(Map.Entry<String, Integer> MyEntry : MyList)
    {  	
    	MyLinkedHashMap.put(MyEntry.getKey(),MyEntry.getValue());     	
    }
    
   
        for(Map.Entry<String, Integer> MyEntry : MyLinkedHashMap.entrySet())
        {
        	System.out.println(MyEntry);
        }
        
        
        
        
    }    
}