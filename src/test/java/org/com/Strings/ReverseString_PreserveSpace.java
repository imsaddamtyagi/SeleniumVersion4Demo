package org.com.Strings;

import org.testng.annotations.Test;

public class ReverseString_PreserveSpace 
{

    @Test
    public void ReserverSapce()
    {
    	String str = "Akkad Bakkad Bambe Bo";
    	
    	
        char[] arr = str.toCharArray();                             // Length = index+1 
        System.out.println("Length of the array is: "+arr.length); // Length=21, Hence Index=20.
        System.out.println("Original String: "+str);
        
        char[] result_arr = new char[arr.length];

               
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == ' ') 
            {
                result_arr[i] = ' ';
            }
        }

         int j = arr.length-1;
         
         for(int i=0;i<arr.length;i++)
         {
        	 if(arr[i]!=' ') // To process only non process characters, starting from last.
        	 {
        		 while(result_arr[j]==' ') // Skipping spaces in result array.
        		 {
        			 j--;
        		 }
        		 
        		 result_arr[j]= arr[i];  // copied at non space position.
        		 j--;
        	 }
        	         	 
         }

         System.out.println("Reversed String: "+String.valueOf(result_arr));

    }

   
}