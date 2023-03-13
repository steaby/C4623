package package1;

public interface MyInterface
{
	public void dosomething();  //Interface method() without body...

}
class Myclass implements MyInterface  //Creating class Myclass
{
	public void dosomething() //Body of interface method do something
	{
		System.out.println("Doing Something");
		
	}	
}
class MyMain //Creating class with main method()
{
	public static void main(String[] args)
	{
		
	Myclass m = new Myclass();//Creating object of class Myclass
	m.dosomething();//Calling method() of interface		
    }
}
