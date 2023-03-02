package package1;

public abstract class AbstractionExample
{
 //creating Fields
	private int id;
	private String name;
	private String address;
	
	//creating Parameterized constructors 
	
public AbstractionExample(int id, String name, String address)
   {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	// creating a Empty Method
	public void mailCheck()
	{
		
	}
	//generating toString()
	@Override
	public String toString()
	{
		return "AbstractionExample [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	//invoking Getters and Setters
	public void setId(int id) 
	
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getaddress() 
	{
		return address;
	}
	public void setaddress(String address) 
	{
		address = address;
	}
	
	
}
