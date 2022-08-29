package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = sc.nextInt();
        
        int num1 = 0;
        System.out.println(num1);
        int num2 = 1;
        System.out.println(num2);
        
        while(num > 2)
        {
        	int sum = num1 + num2;
        	num1 = num2;
        	num2 = sum;
        	num --;
        	System.out.println(sum);
        }
        
     }

}
