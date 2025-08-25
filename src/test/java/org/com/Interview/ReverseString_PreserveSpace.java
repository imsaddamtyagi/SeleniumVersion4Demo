package org.com.Interview;

public class ReverseString_PreserveSpace 
{

    public static void reverseString_PreserveSpaceTest(String str)
    {
        char[] origArray = str.toCharArray();
        char[] resultArray = new char[origArray.length];

        // Step 1: Mark spaces in result array
        for (int i = 0; i < origArray.length; i++)
        {
            if (origArray[i] == ' ')
            {
                resultArray[i] = ' ';
            }
        }

        // Step 2: Fill non-space characters in reverse order
        int j = origArray.length - 1;
        for (int i = 0; i < origArray.length; i++) 
        {
            if (origArray[i] != ' ') 
            {
                while (resultArray[j] == ' ') 
                {
                    j--;
                }
                resultArray[j] = origArray[i];
                j--;
            }
        }

        // Step 3: Print the result
        System.out.println("Original: " + str);
        System.out.println("Reversed (spaces preserved): " + new String(resultArray));
    }

    public static void main(String[] args) {
        reverseString_PreserveSpaceTest("My name is khan");
    }
}