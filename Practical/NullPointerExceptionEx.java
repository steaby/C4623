package io;

import java.util.Scanner;

public class NullPointerExceptionEx 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        String userInput = scanner.nextLine(); 
		  String str = null;
		    if (str == null)
		    {
		      throw new IllegalArgumentException("Variable 'str' is null");
		    }
		    int length = str.length();
		    System.out.println(length);
		  }
		}