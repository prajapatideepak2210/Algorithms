package com.bridgelabz.algorithmprogram.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.algorithmprogram.programs.ToBinary;

public class Utility {
	
	/*
	 * This method is for checking two Strings
	 * are anagram or not
	 */
	public static void checkAnagram(String string1, String string2)
	{
		boolean isAnagram=true;
		String internalString1=string1.toLowerCase();
		String internalString2=string2.toLowerCase();
		String[] stringArray1=internalString1.split("\\s");
		String[] stringArray2=internalString2.split("\\s");
		internalString1="";
		internalString2="";
		
		for(String forInitialization : stringArray1)
		{
			internalString1=internalString1+forInitialization;
		}
		for(String forInitialization : stringArray2)
		{
			internalString2=internalString2+forInitialization;
		}
		
		if(internalString1.length()!=internalString2.length())
		{
			isAnagram=false;
		}
		
		for(int i=0; i<internalString1.length(); i++)
		{
			if(internalString1.indexOf(internalString2.charAt(i))==-1)
			{
				isAnagram=false;
			}
		}
		
		if(!isAnagram)
		{
			System.out.println(string1+" and "+string2+" are not Anagram.");
		}
		else
		{
			System.out.println(string1+" and "+string2+" are Anagram.");
		}
	}
	
	
	/*
	 * This method is for checking
	 * two numbers are anagram or not
	 */
	public static void anagramNumber(String number1, String number2)
	{
		boolean checkAnagram=true;
		
		if(number1.length()!=number2.length())
		{
			checkAnagram=false;
		}
		else
		{
			for(int i=0; i<number1.length(); i++)
			{
				if(number1.indexOf(number2.charAt(i))==-1)
				{
					checkAnagram=false;
				}
			}
		}
		
		if(checkAnagram)
		{
			System.out.println(number1+" and "+number2+" is Anagram.");
		}
		else
		{
			System.out.println(number1+" and "+number2+" is not Anagram.");
		}
	}
	
	/*
	 * This method is for Binary
	 * Search for Strings
	 */
	
	public static void binarySearchForStr(String file)
	{
		Scanner scanner=new Scanner(System.in);
		String string=null;
		//Reading the file
		try {
			FileReader fileReader=new FileReader(file);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			string=bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//Sorted String

		String string1=string.replaceAll(",", "");
		String[] string2=string1.split(" ");
		String temporary;

		System.out.println("Sorted List :-");
		System.out.print("\n--------------------------------");
		for(int i=0; i<string2.length-1; i++)
		{
			for(int j=i+1; j<string2.length; j++)
			{
				if(string2[j].compareTo(string2[i])<0)
				{
					temporary=string2[i];
					string2[i]=string2[j];
					string2[j]=temporary;
				}
			}
		}
		for(int i=0; i<string2.length; i++)
		{
			System.out.println(string2[i]);
		}
		System.out.println("\n--------------------------------");
		System.out.print("Enter the String to search : ");
		String search=scanner.next();

		//Searching
		int first=0, last=string2.length, middle=(first+last)/2;
		while(first<=last)
		{
			if(string2[middle].compareTo(search)>0)
			{
				last=middle-1;
			}
			else if(string2[middle].compareTo(search)==0)
			{
				System.out.println("Your Search "+search+" found at index "+middle);
				break;
			}
			else
			{
				first=middle+1;
			}
			middle=(first+last)/2;
		}

		if(first>last)
		{
			System.out.println("Your search "+search+" is not found in the list.");
		}
	}
	
	/*
	 * This method is for Sorting
	 * the list of numbers.
	 */
	
	public static void bubbleSortForIntgr(int[] list)
	{
		// UnSorted list
		System.out.println("====================================");
		System.out.print("UnSorted List	: ");
		for(int i=0; i<list.length; i++)
		{
			System.out.print(list[i]+" ");
		}
		
		//Sorted List
		System.out.println("\n====================================");
		System.out.print("Sorted List	: ");
		int temporary;
		for(int i=0; i<list.length-1; i++)
		{
			for(int j=i+1; j<list.length; j++)
			{
				if(list[i]>list[j])
				{
					temporary=list[i];
					list[i]=list[j];
					list[j]=temporary;
				}
			}
		}
		for(int i=0; i<list.length; i++)
		{
			System.out.print(list[i]+" ");
		}
	}
	
	/*
	 * This method is for finding
	 * the day of a particular week.
	 */
	public static void dayOfWeek(int year, int month, int day)
	{
		int y= year-(14-month)/12;
		int x= y + (y/4) - (y/100) + (y/400); 
		int m=month + 12 * ((14 - month)/12) - 2;
		int d=(day + x + (31*m) / 12) % 7;
		
		switch(d)
		{
		default :
		case 0:
			System.out.println(day+"/"+month+"/"+year+" : "+"SUNDAY");
			break;
		case 1:
			System.out.println(day+"/"+month+"/"+year+" : "+"MONDAY");
			break;
		case 2:
			System.out.println(day+"/"+month+"/"+year+" : "+"TUESDAY");
			break;
		case 3:
			System.out.println(day+"/"+month+"/"+year+" : "+"WEDNESDAY");
			break;
		case 4:
			System.out.println(day+"/"+month+"/"+year+" : "+"THURSDAY");
			break;
		case 5:
			System.out.println(day+"/"+month+"/"+year+" : "+"FRIDAY");
			break;
		case 6:
			System.out.println(day+"/"+month+"/"+year+" : "+"SATURDAY");
			break;
		}
	}
	
	/*
	 * This method is for finding
	 * your imaging number.
	 */
	public static void findYourNumber(int number)
	{
		Scanner scanner=new Scanner(System.in);
		int steps=number;
		int result=1;
		int n=steps;
		int l1=0;
		int check;
		System.out.println("Imaging a number between 0 to "+(number-2));
		int i=2, j=4, first=1, last=n/2;
		while(first!=last)
		{
			System.out.println("Is your number present b/w "+(first-1)+" to "+(last-1)+"\nenter 1 to yes & 2 to no :");
			check=scanner.nextInt();
			switch(check)
			{
			case 1:
				n=n/2;
				last=last-((last-first+1)/2);
				l1++;
				break;
				
			case 2:
				first=first+n/i;
				last=last+n/j;
				i=i+i;
				j=j+j;
				l1++;
				break;
				
			default :
				System.out.println("You have entered wrong choise, please enter again");
				break;
			}
		}
		System.out.println("Is your no : "+(first-1)+" To yes 1 : ");
		check=scanner.nextInt();
		switch (check) {
		case 1:
			System.out.println("Answer is : "+(first-1));
			break;
			
		default:
			System.out.println("Answer is : "+last);
			break;
		}
	}
	
	/*
	 * This method is for Sorting
	 * The List of String.
	 */
	public static void insertionSort()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter a String for sorting : ");
		String string1=scanner.nextLine();
		String[] stringArray=string1.split(" ");

		//Sorting
		String temporary;
		for (int i = 1; i < stringArray.length; i++) {
			temporary = stringArray[i];
			int j = i-1;
			while ((j>-1) && temporary.compareTo(stringArray[j])<0) {
				stringArray[j+1] = stringArray[j];
				j--;
			}
			stringArray[j+1] = temporary;
		}
		for(int i=0; i<stringArray.length; i++)
		{
			System.out.println(stringArray[i]);
		}
	}
	
	/*
	 * This method is for MergeSort
	 * for the list of integer numbers.
	 */
	public static void mergeSort(int[] list, int low, int high) 
    {
        int n=high-low;
        
        if(n<=1)
        {
        	return;
        }
        
        //dividing the array into sub Array
        int middle=low+n/2;
        mergeSort(list, low, middle);
        mergeSort(list, middle+1, high);
        
        //Sorting
        int[] temporaryList=new int[n];
        int i = low, j = middle;
        for (int k = 0; k < n; k++) 
        {
            if (i == middle)  
            	temporaryList[k] = list[j++];
            else if (j == high) 
            	temporaryList[k] = list[i++];
            else if (list[j]<list[i]) 
            	temporaryList[k] = list[j++];
            else 
            	temporaryList[k] = list[i++];
        }
        
        //reinserting into list
        for (int k = 0; k < n; k++) 
        {
        	list[low + k] = temporaryList[k];
        }
    }
	
	/*
	 * This method is for finding
	 * the Monthly Salary.
	 */
	public static void monthlySalary(double payment, double year, double rateOfPercent)
	{
		double n=12*year;
		double rate=rateOfPercent/(12*100);
		double x=1+rate;
		double x2=Math.pow(x, -n);
		double salary=payment*rate/(1-x2);
		System.out.println("Your Monthly Salary is : "+salary);
	}
	
	/*
	 * This method is for 
	 * dividing the nibbles
	 */
	public static void nibbles(int decimalNumber)
	{
		String string=Integer.toBinaryString(decimalNumber);
        
        int length=string.length();
        System.out.println("Len : "+length);
        if(length%4!=0)
        {
        	if(length%4==1)
        		string="000"+string;
        	else if(length%4==2)
        		string="00"+string;
        	else if(length%4==3)
        		string="0"+string;
        }
        System.out.println(string);
        char[] charArray= string.toCharArray();
       //printing binary conversion
        System.out.print("Binary of "+decimalNumber+" = ");
        for(char c: charArray){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("char : "+charArray.length);
        //swapping characters
        char[] temporaryArray=new char[charArray.length];
        for(int i=0;i<charArray.length/2;i++){
        	temporaryArray[i]=charArray[i];
        }
        int index=0;
        for(int i=(charArray.length/2);i<charArray.length;i++){
        	charArray[index++]=charArray[i];
        }
        for(int i=0;i<charArray.length/2;i++){
        	charArray[index++]=temporaryArray[i];
        }
		System.out.print("Swaped Binary : ");
		for(int i=0; i<charArray.length; i++)
		{
			if(i%4==0)
			{
				System.out.print(" ");
			}
			System.out.print(charArray[i]);
		}
		
		//again converting into decimal digits
		String string1=new String(charArray);
		int value=Integer.parseInt(string1, 2);
		System.out.println("\nNibble Decimal : "+value);
		
		if(power(value))
			System.out.println(value+" is power of 2.");
		else if(!power(value))
			System.out.println(value+" is not power of 2.");
	}
	/*
	 * This is for checking the 
	 * number is of power or 2 or not. 
	 * Related to above method
	 */
	private static boolean power(int number)
	{
		while(number!=1)
		{
			if(number %2 !=0)
			{
				return false;
			}
			else{
			number=number/2;
			}
		}
		return true;
	}
	
	/*
	 * This method is for checking given 
	 * number is palindrome or not.
	 */
	public static boolean palindrome(int number)
	{
		String string1=Integer.toString(number);
		char copyOfnumber[]=string1.toCharArray();
		
		int i=0, length=string1.length()-1;
		boolean isPalindrome=true;
		for(int j=0; j<string1.length(); j++)
		{
			if(copyOfnumber[i]!=copyOfnumber[length])
			{
				isPalindrome=false;
			}
			length--;
			i++;
		}
		return isPalindrome;
	}
	
	/*
	 * This method is for checking 
	 * prime number b/w 0 to 1000.
	 */
	public static boolean primeNumber(int number)
	{
		boolean isPrime=false;
		int number1 = number, count=0;

		for (int i = 1; i <= number1; i++)
		{
			count = 0;
			for (int j = 2; j <= i / 2; j++) 
			{
				if (i % j == 0) 
				{
					count++;
					break;
				}
			}
		}

		if(count==0)
		{
			isPrime=true;
		}
		return isPrime;
	}
	
	/*
	 * This method is for Binary 
	 * searching for only Integer list.
	 */
	public static void binarySearchForInteger()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Binary Search :-\n");
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    int number= scanner.nextInt(); 
	    int array[] = new int[number];
	 
	    System.out.println("Enter " +number+ " integers");
	    
	    for (int i=0; i<number; i++)
	    {
	      array[i]=scanner.nextInt();
	    }
	    //sorting of array
	    int temporary;
	    for(int i=0; i<array.length-1; i++)
	    {
	    	for(int j=i+1; j<array.length; j++)
	    	{
	    		if(array[i]>array[j])
	    		{
	    			temporary=array[i];
	    			array[i]=array[j];
	    			array[j]=temporary;
	    		}
	    	}
	    }
	    System.out.println("Enter value to find");
	    int search = scanner.nextInt();
	    
	    int first=0, last=number-1, middle=(first + last)/2;
	    
	    while(first<=last)
	    {
	      if (array[middle]<search)
	        first = middle + 1;    
	      else if(array[middle]==search) 
	      {
	        System.out.println(search + " found at location " + (middle + 1) + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	    }
	    
	   if (first>last)
	      System.out.println(search + " is not present in the list.\n");
	   long stopTime=System.currentTimeMillis();
	   long ellapseTime=stopTime-startTime;
	   System.out.println("Time taken for Binary Search : "+ellapseTime);
	}
	
	
	/*
	 * This method is for 
	 * Binary Search For String
	 */
	public static void binarySearchForString()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Binary Search :-\n");
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter number of elements : ");
	    int number= scanner.nextInt(); 
	    String array[] = new String[number];
	 
	    System.out.print("Enter " +number+ " Strings : ");
	 
	    for (int i=0; i<number; i++)
	    {
	      array[i]=scanner.next();
	    }
	    
	    Arrays.sort(array);
	    System.out.print("------------------------------------\n");
	    System.out.print("Enter String to find : ");
	    String search = scanner.next();
	    
	    System.out.print("------------------------------------\n");
	    System.out.print("Sorted List : ");
	    int i=1;
	    for(String a : array)
	    {
	    	System.out.print(i+"."+a+" ");
	    	i++;
	    }
	    System.out.print("\n------------------------------------\n");
	    int first=0, last=number-1, middle=(first+last)/2;
	    while(first<=last)
	    {
	    	if(array[middle].compareTo(search)<0)
	    	{
	    		first=middle+1;
	    	}
	    	else if(array[middle].compareTo(search)==0)
	    	{
	    		System.out.println(search + " found at location " + (middle + 1) + ".");
	    		break;
	    	}
	    	else
	    	{
	    		last=middle-1;
	    	}
	    	middle=(first+last)/2;
	    }
	    if (first>last)
		      System.out.println(search + " is not present in the list.\n");
	    
	    long stopTime=System.currentTimeMillis();
		long ellapseTime=stopTime-startTime;
		System.out.println("Time taken for Binary Search : "+ellapseTime);
	}
	
	/*
	 * This method is for 
	 *Insertion Sort for Integer
	 */
	public static void insertionSortForInteger()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Insertion Sort :-\n");
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Number of elements : ");
		int number=scanner.nextInt();
		System.out.println("Enter "+number+" Numbers : ");
		int array[] = new int[number];
		for(int i=0; i<number; i++)
		{
			array[i]=scanner.nextInt();
		}
		
		int temporary;
		
		for (int i = 1; i < number; i++) {
			temporary = array[i];
            int j = i-1;
            while ( (j > -1) && ( array [j] > temporary ) ) {
                array [j+1] = array [j];
                j--;
            }
            array[j+1] = temporary;
        }
		
		for(int k=0; k<number; k++)
		{
			System.out.println(array[k]+" ");
		}
		
		long stopTime=System.currentTimeMillis();
		long ellapseTime=stopTime-startTime;
		System.out.println("Time taken for Binary Search : "+ellapseTime);
	}
	
	/*
	 * This method is for 
	 *Insertion Sort for String
	 */
	public static void insertionSortForString()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Insertion Sort :-\n");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String Line :");
		String string1=scanner.nextLine();
		
		String[] string2=string1.split(" ");
		
		String temporary;
		for (int i = 1; i < string2.length; i++) {
            temporary = string2[i];
            int j = i-1;
            while ((j>-1) && temporary.compareTo(string2[j])<0) {
                string2[j+1] = string2[j];
                j--;
            }
            string2[j+1] = temporary;
        }
	    
		for(int i =0; i<string2.length; i++)
		{
			System.out.print(string2[i]+" ");
		}
		
		long stopTime=System.currentTimeMillis();
		long ellapseTime=stopTime-startTime;
		System.out.println("\nTime taken for Binary Search : "+ellapseTime);
	}
	
	/*
	 * This method is for 
	 * Bubble Sort for Integer
	 */
	public static void bubbleSortForInteger()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Bubble Sort :-\n");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of element : ");
		int number=scanner.nextInt();
		
		int [] arrayForBubbleSort=new int[number];
		System.out.println("Enter "+number+" numbers : ");
		for(int i=0; i<number; i++)
		{
			arrayForBubbleSort[i]=scanner.nextInt();
		}
		
		//Sorting
		int temporary;
		for(int i=0; i<number-1; i++)
		{
			for(int j=i+1; j<number; j++)
			{
				if(arrayForBubbleSort[i]>arrayForBubbleSort[j])
				{
					temporary=arrayForBubbleSort[i];
					arrayForBubbleSort[i]=arrayForBubbleSort[j];
					arrayForBubbleSort[j]=temporary;
				}
			}
		}
		
		System.out.println("Sorted List : ");
		for(int i=0; i<number; i++)
		{
			System.out.print(arrayForBubbleSort[i]+" ");
		}
		
		long stopTime=System.currentTimeMillis();
		long ellapseTime=stopTime-startTime;
		System.out.println("Time taken for Binary Search : "+ellapseTime);
	}
	
	/*
	 * This method is for
	 * Bubble Sort For String
	 */
	public static void bubbleSortForString()
	{
		long startTime=System.currentTimeMillis();
		System.out.println("\nYou have entered for Bubble Sort :-\n");
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String string1=scanner.nextLine();
		String stringArray[]=string1.split(" ");
		System.out.println("-------------------------");
		//Sorting
		String temporary;
		for(int i=0; i<stringArray.length-1; i++)
		{
			for(int j=i+1; j<stringArray.length; j++)
			{
				if(stringArray[i].compareTo(stringArray[j])>0)
				{
					temporary=stringArray[i];
					stringArray[i]=stringArray[j];
					stringArray[j]=temporary;
				}
			}
		}
		System.out.print("Sorted List : ");
		for(int i=0; i<stringArray.length; i++)
		{
			System.out.print(stringArray[i]+" ");
		}
		
		long stopTime=System.currentTimeMillis();
		long ellapseTime=stopTime-startTime;
		System.out.println("\nTime taken for Binary Search : "+ellapseTime);
	}
	
	/*
	 * This method is for checking 
	 * Square Root of a number
	 */
	public static void squareRoot(double number)
	{
		double t=number;
        double epsilon= 1e-15;
        while(Math.abs(t-(number/t))>(epsilon*t)){
            t=((number/t)+t)/2;
        }
        System.out.println("Square Root = "+t);
	}
	
	/*
	 * This method is for checking the 
	 * temperature in celsius and fahrenheit
	 */
	public static void tempratureconversion(double temprature)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 to Fahrenheit to Celsius conversion and 2 to Celsius to Fahrenheit conversion :");
		int choise=scanner.nextInt();
		if(choise==1)
		{
			double tempratureInCelsius=(((temprature-32)*5)/9);
			System.out.println("Temprature in Celsius : "+tempratureInCelsius);
		}
		else if(choise==2)
		{
			double tempratureInFahrenheit=(((temprature*9)/5)+32);
			System.out.println("Temprature in Fahrenheit : "+tempratureInFahrenheit);
		}
		else
		{
			System.out.println("Please choose correct nomber.");
		}
	}
	
	/*
	 * This method is for converting 
	 * decimal number to binary.
	 */
	public static void binaryConverter(int decimalNumber)
	{
		int reminder;
		int printBinary[]=new int[50];
		int index=0;
		System.out.print("Binary Number for "+decimalNumber+" is : ");
		while(decimalNumber>0)
		{
			reminder=decimalNumber % 2;
			printBinary[index]=reminder;
			index++;
			decimalNumber=decimalNumber/2; 
		}
		for(int i=index; i>=0; i--)
		{
			System.out.print(printBinary[i]);
		}
	}
	
	/*
	 * This method is for insertion 
	 * InsertionSort for String
	 */
	public static void insertionSortForStr(String str)
	{
		
		String[] stringArray=str.split(" ");
		
		//Sorting
		System.out.println("Sorted List : ");
		System.out.println("-------------------------------");
		String temporary;
		for (int i = 1; i < stringArray.length; i++) {
            temporary = stringArray[i];
            int j = i-1;
            while ((j>-1) && temporary.compareTo(stringArray[j])<0) {
            	stringArray[j+1] = stringArray[j];
                j--;
            }
            stringArray[j+1] = temporary;
        }
		for(int i=0; i<stringArray.length; i++)
		{
			System.out.print(stringArray[i]+" ");
		}
	}
	
	/*
	 * This method is for binarySearch 
	 * for String from the file
	 */
	public static void binarySearchforString()
	{
		Scanner scanner=new Scanner(System.in);
		String string=null;
		//Reading the file
		try {
			FileReader fr=new FileReader("/home/bridgeit/eclipse-workspace/Deepak Programs/Program files/Binary Search");
			BufferedReader br=new BufferedReader(fr);
			string=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Sorted String
		
		String string1=string.replaceAll(",", "");
		String[] string2=string1.split(" ");
		String temporary;
		
		System.out.println("Sorted List :-");
		System.out.print("\n--------------------------------");
		for(int i=0; i<string2.length-1; i++)
		{
			for(int j=i+1; j<string2.length; j++)
			{
				if(string2[j].compareTo(string2[i])<0)
				{
					temporary=string2[i];
					string2[i]=string2[j];
					string2[j]=temporary;
				}
			}
		}
		for(int i=0; i<string2.length; i++)
		{
			System.out.println(string2[i]);
		}
		System.out.println("\n--------------------------------");
		System.out.print("Enter the String to search : ");
		String search=scanner.next();
		
		//Searching
		int first=0, last=string2.length, middle=(first+last)/2;
		while(first<=last)
		{
			if(string2[middle].compareTo(search)>0)
			{
				last=middle-1;
			}
			else if(string2[middle].compareTo(search)==0)
			{
				System.out.println("Your Search "+search+" found at index "+middle);
				break;
			}
			else
			{
				first=middle+1;
			}
			middle=(first+last)/2;
		}
		
		if(first>last)
		{
			System.out.println("Your search "+search+" is not found in the list.");
		}
	}
	
	/*
	 * This method is for 
	 * chenging the given amount
	 */
	static int total=0;
	static int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
	public static void chengingMachine(int amount)
	{
		vendingMachine(amount);
		System.out.println("Total no of notes is : "+total);
		System.out.println("------------------------------");
		System.out.println("1000\t= "+a+"\n 500\t= "+b+"\n 100\t= "+c+"\n  50\t= "+d+
				"\n  20\t= "+e+"\n  10\t= "+f+"\n   5\t= "+g+"\n   2\t= "+h+"\n   1\t= "+i);
	}
	private static void vendingMachine(int amount)
	{
		if(amount>=1000)
		{
			total++;
			amount=amount-1000;
			a++;
			vendingMachine(amount);
		}
		else if(amount>=500)
		{
			total++;
			b++;
			amount=amount-500;
			vendingMachine(amount);
		}
		else if(amount>=100)
		{
			total++;
			c++;
			amount=amount-100;
			vendingMachine(amount);
		}
		else if(amount>=50)
		{
			total++;
			d++;
			amount=amount-50;
			vendingMachine(amount);
		}
		else if(amount>=20)
		{
			total++;
			e++;
			amount=amount-20;
			vendingMachine(amount);
		}
		else if(amount>=10)
		{
			total++;
			f++;
			amount=amount-10;
			vendingMachine(amount);
		}
		else if(amount>=5)
		{
			total++;
			g++;
			amount=amount-5;
			vendingMachine(amount);
		}
		else if(amount>=2)
		{
			total++;
			h++;
			amount=amount-2;
			vendingMachine(amount);
		}
		else if(amount>=1)
		{
			total++;
			i++;
			amount=amount-1;
			vendingMachine(amount);
		}
	}
	
	/*
	 * This method is for 
	 * finding day on a date.
	 */
}

