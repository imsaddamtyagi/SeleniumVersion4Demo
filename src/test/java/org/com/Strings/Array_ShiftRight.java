package org.com.Strings;


public class Array_ShiftRight   
{
	
	
	public static void doArray_ShiftRight(String str, int k)  
	{
		char arr[] = str.toCharArray();
		
		doReverse(arr,0,arr.length-1);  //0,4
		for(char c: arr) {System.out.print(c);}
		System.out.println();
		
		doReverse(arr,0,k-1);  //0,4
		for(char c: arr) {System.out.print(c);}
		System.out.println();
		
		doReverse(arr,k,arr.length-1);  //0,4
		for(char c: arr) {System.out.print(c);}
		
			
	}
	
	
	
	
    public static void main(String[] args) 
    {  	 
     doArray_ShiftRight("ABCDE",2);          
    }
    
    
    
    public static void doReverse(char arr[],int start, int end) 
    {
    	while(start<end) 
    	{
    	char temp  = arr[start]; 
    	arr[start] = arr[end];  
    	arr[end]   = temp;    
    	start++;  
    	end--;    
    	}
    	
    }
}    
