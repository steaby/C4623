package io;

import java.util.Scanner;

public class ArrayIndexOutOfBoundException 
{

	public static void main(String[] args)
	{
		  Scanner input = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = input.nextInt();

	        int[] array = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++)
	        {
	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = input.nextInt();
	        }

	        System.out.print("Enter the index to access: ");
	        int index = input.nextInt();

	        try {
	            int value = array[index];
	            System.out.println("Value at index " + index + ": " + value);
	        } catch (ArrayIndexOutOfBoundsException e)
	        {
	            System.out.println("Caught an Exception" +" " + e.getMessage());
	        }

	        input.close();
	    }
	}