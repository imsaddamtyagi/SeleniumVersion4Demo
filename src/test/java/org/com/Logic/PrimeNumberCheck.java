package org.com.Logic;

public class PrimeNumberCheck
{
    public static boolean isPrime(int number) 
    {
    	
    	
        if (number <= 1)
        {
            return false; // Numbers less than or equal to 1 are not prime
        }
        
        
        for (int i = 2; i < number; i++)
        { 
            if (number % i == 0)   // Check all numbers from 2 to number 
            {
                return false;     // If divisible by any number than not a prime.
            }
            
            
        }
        return true; // Otherwise, it's prime
    }

    public static void main(String[] args) 
    {
        int num = 29; // Replace with the number you want to check
        if (isPrime(num)) 
        {
            System.out.println(num + " is a prime number.");
        } 
        else 
        {
            System.out.println(num + " is not a prime number.");
        }
    }
}