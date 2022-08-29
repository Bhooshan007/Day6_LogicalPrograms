package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int divisor = 1; divisor < num; divisor++)
		{
			if(num % divisor == 0)
			{
				sum += divisor;
			}
		}
		if(num == sum)
		{
			System.out.println("It is a Perfect Number");
		}
		else
		{
			System.out.println("It is not a Perfect Number");
		}
		
		
		
	}

}
