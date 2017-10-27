package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class TempratureConversion {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Temprature : ");
		double Temprature=scanner.nextDouble();
		
		Utility.tempratureconversion(Temprature);
	}
}
