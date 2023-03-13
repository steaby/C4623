package package1;
import java.util.Scanner;
public class PrimeNumber
{	
	public static void main(String[] args) 
	{
		// Creating Scanner to take input from user
		  	Scanner input = new Scanner(System.in);
	        int num;
	        do 
	        {
	            System.out.print("Enter a number: ");
	            num = input.nextInt();
	        }
	        while (num < 2);
	        boolean isPrime = true;
	        for (int i = 2; i <= Math.sqrt(num); i++)
	        {
	            if (num % i == 0) 
	            {
	                isPrime = false;
	                break;
	            }
	        }
	        if (isPrime)
	        {
	            System.out.println("It is a Prime Number");
	        } 
	        else
	        {
	            System.out.println("It is not a primenumber");
	        }
	        
	}
}