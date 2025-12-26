package org.com.Simple;

public class Break_Continue {
	

    static void Try_Break(int[] arr)
    {
    	
        for (int i = 0; i < arr.length; i++) {
        	
            if (arr[i] == 3) { 
                System.out.println("Breaking at value: " + arr[i]);
                break;
            }
        }
        System.out.println("After break, out of the for loop");
        
    }
    
    
    static void Try_Continue(int[] arr)
    {
    	
        for (int i = 0; i < arr.length; i++) {
        	
            if (arr[i] == 3) 
            { 
                System.out.println("Continuing at value: " + arr[i]);
                continue;
            }
            
            
        }

        
    }
    
    
    

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5}; // Define the array
       // Try_Break(arr);
        Try_Continue(arr);

    }
}