package org.com.Interview;

public class ReverseString_PreserveSpace {

 	
    	static void reverseString_PreserveSpaceTest(String str)
    	{
    		                                                                                                                                                                                                                                                                                                                                                                                                                                                       
    		char arr[] = str.toCharArray();
    		
    		char[] Result_Array = new char[str.length()];
    		
    		
    		for(int i=0;i<arr.length;i++)
    		{
    		   if(arr[i]==' ')
    		   {
    			   Result_Array[i]=' ';
    		   }
    		}
    		
     		for(int i=0;i<arr.length;i++)
     		{
     			
     		}
    		
 		
    		
    	}
   
    	
  
     
    public static void main(String[] args) {
    	
        reverseString_PreserveSpaceTest("My name is khan");
    }
}