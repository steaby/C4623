package package1;
import java.util.Scanner;
public class Table 
{

	public static void main(String[] args) 
	{
		//Creating a scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print it's table: ");
		//Creating a variable using scanner class object
		int number=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+"*"+i+"="+number*i);
			
		}
		sc.close();
	}

}
