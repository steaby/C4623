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
			System.out.println("meow meow...");
		}
	}
	//creating a child class for the cat class which is a parent class 
	class Dogs extends Creature
	{
		//creating a method
		public void sound()
		{
			System.out.println("Barks...");
		}
	}
	class Inherittester
	{
		public static void main (String[] args)
		{
			//creating a object
			Cat c = new Cat();
			c.display();
			c.sound();
			Dogs b = new Dogs();
			b.display();
			b.sound();	
			
		}
	}

