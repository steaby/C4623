
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import com.student.model.Students;

class TestDeleteStudent
{
	@Test
	public void testdeleteStudent()
	{
		Students st2 = new Students();
		st2.setFirstname("gj");
		st2.setLastname("hjs");
		st2.setEmail("sgjh");
		st2.setBatch("do");
		
		Assert.assertEquals("gj",st2.getFirstname());
		Assert.assertEquals("hjs",st2.getLastname());
		Assert.assertEquals("sgjh",st2.getEmail());
		Assert.assertEquals("do",st2.getBatch());
	}


}
