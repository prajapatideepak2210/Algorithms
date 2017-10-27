package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class AnagramNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean check=false;
		String forNumber="\\d*";
		do{
			System.out.println("Enter the first number : ");
			String number1=scanner.nextLine();
			System.out.println("Enter the second number : ");
			String number2=scanner.nextLine();
			if(number1.matches(forNumber) && number2.matches(forNumber))
			{
				Utility.anagramNumber(number1, number2);
				check=true;
			}
			else
			{
				System.out.println("You are not entering numbers, please try again.");
			}
		}while(check);
	}
}
