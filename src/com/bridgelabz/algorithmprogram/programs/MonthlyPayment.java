package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class MonthlyPayment {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your Yearly payment : \n");
		double payment=scanner.nextDouble();
		System.out.print("Enter the year : \n");
		double year=scanner.nextDouble();
		System.out.print("Enter the rate of percent : \n");
		double rateOfPercent=scanner.nextDouble();
		
		Utility.monthlySalary(payment, year, rateOfPercent);
	}
}
