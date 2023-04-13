package io;

import java.util.Scanner;

public class ArrayOutOfBoundExceptionEx 
{

	public static void main(String[] args)
	{
		 int[] arr = new int[5];
		 Scanner scanner = new Scanner(System.in);

		 // prompt the user to enter 5 integers and store them in the array
		 System.out.println("Enter 5 integers:");
		 for (int i = 0; i < 5; i++)
		 {
			 arr[i] = scanner.nextInt();
		 }

		 // ask the user to enter an index and display the value within the index
		 System.out.println("Enter an index (0 to 4):");
		 int index = scanner.nextInt();

		 try
		 {
			 int value = arr[index];
			 System.out.println("Value at index " + index + " is " + value);
		 }
		 catch (ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Error" + "\n" +e);
		 }
		 scanner.close();
	}
}