package package1;
import java.util.Scanner;
public class ForLoopExample
{

	public static void main(String[] args) 
	{
		//Creating a scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times you want to print Happy Easter.....'");
		//Creating a variable using scanner class object
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			System.out.println("Happy Easter......");
		}
		sc.close();
	}
		
}


