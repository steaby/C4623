package package1;

public class Testencapsulation 
{

	public static void main(String[] args)
	{
		// creating object of class EncapsulationExample
		Encapsulationexample a=new Encapsulationexample();
		// object is used to access the methods of a class
		a.setId(55);
		a.setName("Stella");
		System.out.println("Id:"+a.getId()+"\n"+"Name:"+a.getName());

	}

}
