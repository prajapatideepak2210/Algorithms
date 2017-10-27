package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class AnagramDetection {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String string1=scanner.nextLine();
		System.out.println("Enter the second String : ");
		String string2=scanner.nextLine();
		
		Utility.checkAnagram(string1, string2);
	}
}
