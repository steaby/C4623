package junit;

public class Factorial
{
	public static int calculate(int n)
	{
		if(n<0)
		{
		throw new IllegalArgumentException("Input must be non negative.");
	}
	int result=1;
	for(int i=1;i<=n;i++)
	{
		result=result*i;
	}
	return result;
}
}
