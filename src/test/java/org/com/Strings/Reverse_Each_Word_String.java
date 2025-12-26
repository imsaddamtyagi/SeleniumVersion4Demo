package org.com.Strings;

public class Reverse_Each_Word_String
{
		
	public static void main(String[] args)
	{
		String str = "Husain Tyagi";
		
		String StringArr []= str.split(" ");
		
		char [] arr1 = StringArr[0].toCharArray();
		char [] arr2 = StringArr[1].toCharArray();
		
		reverse(arr1,0,arr1.length-1);  //{'H','u','s','a','i','n'}   Array Length = 6
		reverse(arr2,0,arr2.length-1); // {'T','y','a','g','i'}       Array Length = 5
			
	}
	
	static void reverse(char arr[],int start, int end)
	{
		while(start<end)
		{
			char temp =  arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;			
		}
		
		for(char c:arr)
		{
			System.out.print(c);
		}
		System.out.print(" ");
		
		
		
	}
	

}
