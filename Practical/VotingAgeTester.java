package package1;
import java.util.Scanner;

public class VotingAgeTester 
{

	public static void main(String[] args)
	{
		
		  //Creating a scanner class to take input from user
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your Age: ");
				//Creating a variable using scanner class object
				int Age=sc.nextInt();
				//Checking the condition
				if(Age>18)
				{
					System.out.println("You are Eligible to Vote");
				}
				else if(Age>=18)
				{
					System.out.println("You are Eligible to Vote");
				}
				else
				{
					System.out.println("You are Not Eligible to Vote");
				}
				
				
	}

}
