package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest 
{

	@Test
	public void calculate()
	{
		Factorial Fac=new Factorial();
		int result = Factorial.calculate(5);
		assertEquals(120,result);	
	}
	
	@Test
	public void testcalculatenegative()
	{
		Assertions.assertThrows(IllegalArgumentException.class,()->Factorial.calculate(-1));
	}
	

}
