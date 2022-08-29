package com.bridgelabz;

import java.util.Scanner;

public class ReverseANumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num = sc.nextInt();
        int remainder;
        int reverse = 0;
        
        while(num > 0)
        {
        	remainder = num % 10;
        	reverse = reverse * 10 + remainder;
        	num = num / 10;
        }
        System.out.println("Reverse Number Is :"+reverse);	
		
		
	}

}
