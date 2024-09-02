package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample4 {
    @Test
	public void hardAssertStrictCompare()
	{
		String expectedData="raja";
		String actualData="raja";
		Assert.assertEquals(expectedData, actualData);
		System.out.println("Strict compariosn Passes!!");
		
	}
    @Test
    public void hardAssertContainsComapre()
    {
    	String expectedData="raja";
    	String actualData="maharaja";
    	Assert.assertTrue(actualData.contains(expectedData));
    	System.out.println("Contains comparison passed");
    }
}
