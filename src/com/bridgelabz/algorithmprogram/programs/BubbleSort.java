package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter How many Numbers you want to insert : ");
		int number=scanner.nextInt();
		System.out.println("Enter "+number+" numbers : ");
		int[] list=new int[number];
		for(int i=0; i<number; i++)
		{
			list[i]=scanner.nextInt();
		}
		
		Utility.bubbleSortForIntgr(list);
	}
}
