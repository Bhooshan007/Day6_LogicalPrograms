package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num = sc.nextInt();

        boolean isPrime = true;
        
        for(int i = 2; i < num/2; i++)
        {
        	if(num % i == 0)
        	{
        		isPrime = false;
        	}
        	
        }
		if(isPrime == true)
		{
			System.out.println("It is a Prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
		
		
		
	}

}
