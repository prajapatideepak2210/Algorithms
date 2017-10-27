package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year=scanner.nextInt();
		System.out.println("Enter the Month : ");
		int month=scanner.nextInt();
		System.out.println("Enter the day : ");
		int day=scanner.nextInt();
		
		Utility.dayOfWeek(year, month, day);
	}
}
