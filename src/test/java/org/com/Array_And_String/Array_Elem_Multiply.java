package org.com.Array_And_String;

public class Array_Elem_Multiply
{
	
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4};
		int n = arr.length; 
		
		int arrNew[] = new int [n];
		
		
		arrNew[0] = arr[1] * arr[2];
		arrNew[1] = arr[0] * arr[2];
		arrNew[2] = arr[0] * arr[1];
		
		
    
		int[] leftarr   = new int[n];
		int[] rightarr  = new int[n]; 
	//	int[] Finalarr  = new int[n];
		
	    // Initialize both array
		leftarr[0] = 1; 
		rightarr[n - 1] = 1;
		
		// Fill left array 
		for (int i = 1; i < n; i++) 
		{
			leftarr[i] = arr[i - 1] * leftarr[i - 1];
		}
		
		
		
		
	}

}
