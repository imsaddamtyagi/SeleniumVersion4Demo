package org.com.Interview;


public class PreserveSpaceReverseString 
{
	String strn = "Akkad Bakkad Bambe Bo";
	
	char [] OrigArr  = strn.toCharArray();
	char [] ResultArr = new char[OrigArr.length];
	
	
	public void PreserveSpaceReverseStringTest()
	{
		
		for(int i=0;i<OrigArr.length;i++)
		{
			if(OrigArr[i]==' ')
			{
				ResultArr[i] = ' ';
			}
		}
		
		for(int k=0;k<OrigArr.length;k++)
		{
			
			if(OrigArr[k]!=' ')
			{
				OrigArr[k]--;
			}
			
			
			
			
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		PreserveSpaceReverseString MyObj = new PreserveSpaceReverseString();
		
		MyObj.PreserveSpaceReverseStringTest();
		
		
	}

}
