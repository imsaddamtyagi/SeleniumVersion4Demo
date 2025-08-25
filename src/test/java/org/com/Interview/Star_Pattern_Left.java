	package org.com.Interview;

public class Star_Pattern_Left {
	
	
	public static void main(String[] args) {
		
		
		for(int i=0;i<5;i++)     
		{			
		for(int j=0;j<i;j++)      
		{				
	    System.out.print("*");	     /// 1)0>0 ->Fail   -> Inner Loop Crashed   ->Print New Line
		} 		                    //   2)1>0 ->Pass   -> Print *    [i.e *]
		System.out.println();      ///   3)1>1 ->Fail   -> Inner Loop Crashed    ->Print New Line 		 	                	  
		}				          //     4)2>0 ->Pass   -> Print *
}	                             //      5)2>1 ->Pass   -> Print *    [i.e **]	
}	                            ///      6)2>2 ->Fail   -> Inner Loop Crashed	 ->Print New Line
                               //        7)3>0 ->Pass   -> Print *  
                              //         8)3>1 ->Pass   -> Print *  
                             //          9)3>2 ->Pass   -> Print *    [i.e ***]	
                            ///         10)3>3 ->Fail   -> Inner Loop Crashed    ->Print New Line                            	            	
                           //           11)4>0 ->Pass   -> Print *  
                          //            12)4>1 ->Pass   -> Print *  
                         //             13)4>2 ->Pass   -> Print *  	
                        //              14)4>3 ->Pass   -> Print *    [i.e ****]
                       ///              15)4>4 ->Fail   -> Inner Loop Crashed    ->Print New Line                  


/*
For i>j --->Run inner loop i times---> Run inner loop 0 times, than 1 times, than 2 times, than 3 times , then 4 times.
*/