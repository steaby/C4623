package package1;

public class Abstractiondata extends AbstractionExample 
{
	//creating a new field
	private double salary;
	//creating Parameterized constructors
	public Abstractiondata(int id, String name, String address, double salary)
	{
		super(id, name, address);
		this.salary = salary;
	}
	public void mailCheck()
	{
		System.out.println("Mailing check to:"+getName());
	}	
}
