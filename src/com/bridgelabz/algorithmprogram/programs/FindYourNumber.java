package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class FindYourNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=scanner.nextInt();
		
		Utility.findYourNumber(number);
	}
}
