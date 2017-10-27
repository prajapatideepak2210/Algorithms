package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=scanner.nextInt();
		
		if(Utility.primeNumber(number))
		{
			System.out.print(number+" is prime");
			if(Utility.palindrome(number))
			{
				System.out.println(", "+number+" is palindrome also.");
			}
			else
			{
				System.out.println(", "+number+" is not palindrome.");
			}
		}
		else
		{
			System.out.println(number+" is not prime.");
		}
	}
}
