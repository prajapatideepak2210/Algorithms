package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class InsertionSortForString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter a String for sorting : ");
		String string=scanner.nextLine();
		
		Utility.insertionSortForStr(string);
	}
}
