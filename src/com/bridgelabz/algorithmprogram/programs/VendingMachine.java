package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class VendingMachine {
	public static void main(String[] args) {
		System.out.println("Enter the amount : ");
		Scanner scanner=new Scanner(System.in);
		int amount=scanner.nextInt();
		int total=0;
		
		Utility.chengingMachine(amount);
		
	}
}
