package array;
import java.util.Scanner;

public class MarksCalculator
{

	public static void main(String[] args)
	{
		 int[] marks = new int[5];
	        Scanner scanner = new Scanner(System.in);
	        
	        // Accept marks from user
	        System.out.println("Enter marks for 5 subjects:");
	        for (int i = 0; i < marks.length; i++) 
	        {
	            System.out.print("Subject " + (i+1) + ": ");
	            marks[i] = scanner.nextInt();
	        }
	        
	        // Calculate total marks
	        int total = 0;
	        for (int i = 0; i < marks.length; i++)
	        {
	            total += marks[i];
	        }
	        
	        // Calculate percentage
	        double percentage = (double) total / marks.length;
	        
	        // Display results
	        System.out.println("Total marks: " + total);
	        System.out.println("Percentage: " + percentage);
	        scanner.close();
	    }
}