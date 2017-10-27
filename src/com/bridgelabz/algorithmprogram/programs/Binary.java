package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class Binary {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter Decimal Number : ");
		int decimalNumber= scanner.nextInt();
		
		Utility.nibbles(decimalNumber);
	}
}
