package com.bridgelabz.algorithmprogram.programs;

import java.util.Scanner;

import com.bridgelabz.algorithmprogram.utility.Utility;

public class MergeSort {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how many elements you want to insert : ");
		int size=scanner.nextInt();
		int[] list=new int[size];
		System.out.println("Enter "+size+" elements : ");
		for(int i=0; i<size; i++)
		{
			list[i]=scanner.nextInt();
		}
		int low=0;
		int high=list.length;
		
		Utility.mergeSort(list, low, high);
		
		System.out.println("Sorted List : ");
		for(int a : list)
		{
			System.out.print(a+" ");
		}
	}
}
