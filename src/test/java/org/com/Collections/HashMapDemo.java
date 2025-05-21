package org.com.Collections;

import java.util.*;

public class HashMapDemo {
	
    public static void main(String[] args) {
    	
        HashMap<String, Integer> MyHashMap = new HashMap<>();
        MyHashMap.put("Name", 2);
        MyHashMap.put("Khan", 4);
        MyHashMap.put("My", 1);
        MyHashMap.put("is", 3);


        List<Map.Entry<String, Integer>> MyList = new ArrayList<>(MyHashMap.entrySet());


        MyList.sort((Arg1, Arg2) -> Arg1.getValue().compareTo(Arg2.getValue()));

  
        LinkedHashMap<String, Integer> MyLinkedHashmap = new LinkedHashMap<>();
        
        for (Map.Entry<String, Integer> MyEntry : MyList) {
            MyLinkedHashmap.put(MyEntry.getKey(), MyEntry.getValue());
        }


        for (Map.Entry<String, Integer> MyEntry : MyLinkedHashmap.entrySet()) {
            System.out.println(MyEntry.getKey() + " -> " + MyEntry.getValue());
        }
    }
}