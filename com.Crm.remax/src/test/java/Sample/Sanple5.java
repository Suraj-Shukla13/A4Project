package Sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sanple5 {
	@Test
	public void softAssertStrictCompare()
	{
		String expectedData="raja";
		String actualData="Raja";
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(actualData, expectedData);
		System.out.println("Strict compariosn Passes!!");
		sa.assertAll();
		
	}
    @Test
    public void softAssertContainsComapre()
    {
    	String expectedData="raja";
    	String actualData="maharaja";
    	SoftAssert sa= new SoftAssert();
    	sa.assertTrue(actualData.contains(expectedData));
    	System.out.println("Contains comparison passed");
    	sa.assertAll();
    }

}
