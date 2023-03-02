package package1;
//creating a parent class
class Creature
{
		// creating a method 
	   public void display()
	   {
		System.out.println("Inside parent class");  
	   }
	}
	// creating a child class for the above parent class
	class Cat extends Creature
	{
		// creating a method
		public void sound()
		{
			System.out.println("Meow...");
		}
	}
	//creating a child class for the cat class which is a parent class 
	class Kitten extends Cat
	{
		//creating a method
		public void body()
		{
			System.out.println("kittens have belly buttons");
		}
	}
	class Inherittester
	{
		public static void main (String[] args)
		{
			//creating a object
			Kitten c = new Kitten();
			c.display();
			c.sound();
			c.body();
			
		}
	}

