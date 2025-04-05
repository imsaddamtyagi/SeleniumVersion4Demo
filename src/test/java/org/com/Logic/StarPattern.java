package org.com.Logic;

public class StarPattern 
{
	
	public static void main(String[] args)
	{
		
	       for(int i=0;i<=5;i++)         // i =0,1,2,3,4
		   {
	       for(int j=0;i>j;j++)   	   //(0>0)->F | (0>1)->F | (0>2)->F | (0>3)->F | (0>4)->F
	       {                          // (1>0)->P | (1>1)->F | (1>2)->F | (1>3)->F | (1>4)->F
	    	System.out.print("*");   //  (2>0)->P | (2>1)->P | (2>2)->F | (2>3)->F | (2>4)->F                                       //   (3,0)->P | (3,1)->P | (3,2)->P | (3,3)->F | (3,4)->F
			                        //   (3>0)->P | (3>1)->P | (3>2)->P | (3>3)->F | (4>4)->F          
		    }                      //    (4>0)->P | (4>1)->P | (4>2)->P | (4>3)->P | (4>4)->F
	       System.out.println();
		        }
	         

		
	}

}
