package package1;
//creating a parent class
 class Animal
{
	// creating a method 
   public void display()
   {
	System.out.println("Inside parent class");  
   }
}
//creating a child class for the above parent class
class Dog extends Animal
{
	// creating a method
	public void sound()
	{
		System.out.println("Barks...");
	}
}
class inheritancetester
{
	public static void main (String[] args)
	{
		//creating a object
		Dog d = new Dog();
		d.display();
		d.sound();
	}
}