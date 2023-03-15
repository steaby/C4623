package operators;

import java.util.Scanner;

public class AssignmentOperator 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = input.nextInt();
		System.out.println("Enter another number:");
		int num2 =input.nextInt();
		 System.out.println("Initial value of num1: " + num1);
		 System.out.println("Initial value of num2: " + num2);

		 // Assignment operators example
		 num1 += num2;
		 num2 -= num1;

		 System.out.println("Final value of num1: " + num1);
		 System.out.println("Final value of num2: " + num2);
		 input.close();
	}

}