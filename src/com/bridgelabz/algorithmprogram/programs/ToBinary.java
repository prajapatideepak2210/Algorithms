package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class ToBinary {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the decimal number : ");
		int decimalNumber=scanner.nextInt();
		
		Utility.binaryConverter(decimalNumber);
	}
}
