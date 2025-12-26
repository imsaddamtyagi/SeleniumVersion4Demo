package org.com.Strings;

import java.util.HashMap;

public class RemoveDuplicateFromString
{
	
	
	static String str = "oookkktt";
	static HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	
	static char arr[] = str.toLowerCase().toCharArray();
	
    static 	StringBuilder sb = new StringBuilder();
	
	

	public static void main(String[] args)
	{
		
		for(char c : arr)
		{
			if(hm.containsKey(c))
			{
				hm.put(c,hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
				sb.append(c);
				System.out.println(sb);

			}			
			
		}

}
	
}
