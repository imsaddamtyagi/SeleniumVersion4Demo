package org.com.Strings;

public class ArrayOfString {
	
	public static void main(String[] args) {
		
		
		String First [] =  {"My","name","is","Khan"};
		String Second[] =  {"My","name","is","Tyagi"};
		
		int LengthOfFirst =  First.length;   //4
		int LengthOfSecond = Second.length; // 4
		
		System.out.println("Length of first string array:"+LengthOfFirst);
		System.out.println("Length of second string array:"+LengthOfSecond);
		
		
		for(int i=0;i<LengthOfFirst;i++)
		{
			String temp = First[i];
			System.out.print(temp);
			
			
		}
		
		
		
		
	}

}
