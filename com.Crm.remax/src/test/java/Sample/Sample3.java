package Sample;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample3 {
	
    @Test
	public void createUser()
	{
		System.out.println("User created");	
	}
    //@Test(enabled=false)
	@Test(invocationCount=0)
	public void modifyUser()
	{
		System.out.println("User Modified");
	}
	@Ignore
	@Test
	public void deleteUser()
	{
		System.out.println("user deleted");
	}

}
