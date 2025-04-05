package org.com.Array_And_String;

import java.util.Arrays;

public class String_Anagram 
    
{	
	
	public static void main(String[] args) 
	{
		String str1 = "Husain";
		String str2 = "Niasuh";
		
		char arr1[] = str1.toLowerCase().toCharArray();		
		char arr2[] = str2.toLowerCase().toCharArray();	
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		System.out.println("String are Anagram");
		else
		System.out.println("Not Anagram");
		
	}
	
	

}
