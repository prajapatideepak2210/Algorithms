package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;
import com.bridgelabz.algorithmprogram.utility.*;

public class Utility2 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Here you will found some algorithams.");
		System.out.println("\nPlease enter 1 to Binary Search For Integer.\nenter 2 to Binary Search For String.");
		System.out.println("enter 3 to Insertion Sort For Integers. \nenter 4 to InsertionSort for String.");
		System.out.println("enter 5 to Bubble Sort For Integers.\nenter 6 to Bubble Sort For String.");
		System.out.print("\nPlease any one frome above : ");
		int userChoise=scanner.nextInt();
		
		
			switch(userChoise)
			{
			case 1:
				Utility.binarySearchForInteger();
				break;

			case 2:
				Utility.binarySearchForString();
				break;

			case 3:
				Utility.insertionSortForInteger();
				break;

			case 4:
				Utility.insertionSortForString();
				break;

			case 5:
				Utility.bubbleSortForInteger();
				break;

			case 6:
				Utility.bubbleSortForString();
				break;
				
			default:
				System.out.println("\nYou have entered wrong choise, please try again next time.");
				break;
			}
		
		
		System.out.println("Thanks For Using.");
	}
}
