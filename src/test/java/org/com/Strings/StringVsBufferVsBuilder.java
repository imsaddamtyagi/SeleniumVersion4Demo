package org.com.Strings;

import org.testng.annotations.Test;

public class StringVsBufferVsBuilder
{
	
	@Test
	public void StringLiteralDemo()
	{
		String Literal = "Hello";
	  //Literal + " Husain";   // Will not work as it is not assigned to another variable.
		 String LiteralAgain =  Literal + " Husain"; 	 
		 System.out.println("Added two string and assigned to new string: "+LiteralAgain);	
	}

	@Test
	public void String_Using_New()
	{
		String str = new String("Hello");	
		System.out.println("String created using new keyword: "+str);
		
	}

	
	

		
		
	}


