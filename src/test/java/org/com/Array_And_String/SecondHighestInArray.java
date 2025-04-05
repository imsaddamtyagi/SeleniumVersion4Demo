package org.com.Array_And_String;

public class SecondHighestInArray 
{
	
	public static void main(String[] args) 
	{
		int Arr[] = {1,7,2,6,5};
		int ArrLength = Arr.length;
		int Max= Arr[0];
		int SecondMax= Arr[0];
		
		System.out.println("Array Length:"+ArrLength);
		
		for(int i=0;i<ArrLength;i++)
		{
			if(Max<Arr[i])
			{
				Max=Arr[i];
				
			}
		}
		
		System.out.println("Maximum element in array is:"+Max);
		
		for(int j=0;j<ArrLength;j++)
		{
			if(SecondMax<Arr[j] && Arr[j]!=Max)
			{
				SecondMax=Arr[j];
			}
			
		}
		
		System.out.println("Second Maximum element in array is:"+SecondMax);

		
	}

}
