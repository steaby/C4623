package array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrayLab
{

	public static void main(String[] args)
	{
		  Scanner scanner = new Scanner(System.in);
		//Get the dimensions of the array from the user...
	        System.out.print("Enter the number of rows: ");
	        int numRows = scanner.nextInt();

	        System.out.print("Enter the number of columns: ");
	        int numCols = scanner.nextInt();
	      //create the array with the user specified dimension...
	        int[][] array = new int[numRows][numCols];
	      //Get the values for the array from the user...
	        System.out.println("Enter the elements of the array:");
	        //using a loop to fill the arrays with values
	        for (int i = 0; i < numRows; i++) 
	        {
	            for (int j = 0; j < numCols; j++)
	            {
	                array[i][j] = scanner.nextInt();
	            }
	        }

	        int[] rowSums = new int[numRows];
	        int[] colSums = new int[numCols];
	      //using nested loop to calculate sum of each row and column
	        for (int i = 0; i < numRows; i++) 
	        {
	            for (int j = 0; j < numCols; j++)
	            {
	                rowSums[i] += array[i][j];
	                colSums[j] += array[i][j];
	            }
	        }
	      //print output of the array..
	        System.out.println("The sum of each row is:");
	        System.out.println(Arrays.toString(rowSums));

	        System.out.println("The sum of each column is:");
	        System.out.println(Arrays.toString(colSums));
	        scanner.close();
	    }
	}