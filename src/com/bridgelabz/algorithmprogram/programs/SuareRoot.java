package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class SuareRoot {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number : ");
        double number= scanner.nextDouble();
        
        Utility.squareRoot(number);
	}
}
