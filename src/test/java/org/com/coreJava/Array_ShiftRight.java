package org.com.coreJava;


public class Array_ShiftRight
{
	
    public static void main(String[] args) 
    {
    	 int arr[] = {10,20,30,40,50,60,70};
    	 
    	 int k=5;   	
    	 int Length = arr.length;
    	 System.out.println("Array Length is "+Length); //7
    	 k = k%Length;
    	 System.out.println("Actual Shift times is "+k); //5
    
    	 
    	 
    	 
    	 reverse(arr,0,Length-1); // Reverse the whole array->            from arr[0] to arr[6] index
    	                         //  Output: {70,60,50,40,30,20,10}
    	 
    	 reverse(arr,0,k-1);  // Reverse the first k elements->           from arr[0] to arr[k-1=4]
    	                     // Output: {30,40,50,60,70,20,10}
    	 
    	 reverse(arr,k,Length-1); // Reverse the remaining elements       from arr[5] to arr[6] index
    	 
        System.out.println("After Right Shift "+k+" times");
        
    	for(int t: arr)
    	{
    	 System.out.print(t+",");
    	}
    	 
        
    }
    
    public static void reverse(int arr[],int start, int end)
    {
    	while(start<end)
    	{
    		int temp=arr[start];
    		arr[start]= arr[end];
    		arr[end]= temp;
    		start++;
    		end--;		
    	}
    	
    }
}
