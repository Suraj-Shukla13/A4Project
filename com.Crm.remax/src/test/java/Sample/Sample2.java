package Sample;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(priority=1,invocationCount=5)
	
	public void createUser()
	{
		System.out.println("User created");	
	}
	@Test(priority=2, dependsOnMethods={"createUser"})
	public void modifyUser()
	{
		System.out.println("User Modified");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
	

}
