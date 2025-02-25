package org.com.coreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapByValue {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> hm = new HashMap<>();
		                        hm.put("Two",2);
		                        hm.put("One",1);
		                        hm.put("Nine",9);
		                        hm.put("Five",5);
		                        hm.put("Six",6);
		                        
		   List<Map.Entry<String,Integer>> MyList = new ArrayList<>(hm.entrySet());         // Create a List with HashMap.
		   MyList.sort((Entry1,Entry2) -> Entry1.getValue().compareTo(Entry2.getValue())); // Sort the List using Lambda.
		   
		   	   
		   LinkedHashMap<String,Integer> SortedMap = new LinkedHashMap<>();              // Create An Empty Linked HashMap
		
		   
		   for(Map.Entry<String, Integer> MyEntry: MyList)
		   {
			   SortedMap.put(MyEntry.getKey(),MyEntry.getValue());			        // Using for loop, enter the values in map   
		   }
		   	   
		  System.out.println("Printing Sorted HashMap:-");
		  
		  for(Map.Entry<String, Integer> MyEntry: SortedMap.entrySet())
		  {
			  System.out.println(MyEntry.getKey() +" "+MyEntry.getValue());
			  
		  }
		      		      
		      
		      
		                        
		                        
		                        
		                        
		                        
		                        
		
		
		
		
		
		
		
		
	}

}
