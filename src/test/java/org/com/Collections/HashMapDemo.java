package org.com.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
	
	
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> MyHashMap = new HashMap<>();
		
		MyHashMap.put("Name",2);
		MyHashMap.put("Khan",4);
		MyHashMap.put("My",1);
		MyHashMap.put("is",3);
		
		
	  List<Map.Entry<String,Integer>> MyList = new ArrayList<>(MyHashMap.entrySet());
	  
	  
	  MyList.sort((Entry1,Entry2) -> Entry1.getValue().compareTo(Entry2.getValue() ));
	  
	  
	  LinkedHashMap<String,Integer> MyLinkedHasMap = new LinkedHashMap<>();
	  
	  
	  
	  for(Map.Entry<String, Integer> MyEntry: MyList)
	  {
		  
		  MyLinkedHasMap.put(MyEntry.getKey(),MyEntry.getValue());
		  
	  }
	  
	  System.out.println("Printing sorted HashMap: ");
	  for(Map.Entry<String, Integer> MyEntry: MyLinkedHasMap.entrySet())
	  {
		  
	   System.out.println(MyEntry);
		  
	  }
	  
	  
	  
          
		
		
	}

}
