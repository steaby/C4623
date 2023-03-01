package package1;

public class TestStudentData
{
	public static void main(String[] args)
	{
		// creating object of class StudentData
		StudentData a=new StudentData();
		// object is used to access the methods of a class
		a.setId(55);
		a.setName("Stella");
		a.setAge(20);
		System.out.println("Id:"+a.getId()+"\n"+"Name:"+a.getName()+"\n"+"Age:"+a.getAge());

    }
}