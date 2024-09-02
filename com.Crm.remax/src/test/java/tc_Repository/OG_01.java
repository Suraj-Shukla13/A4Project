package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.CreateNewOrgPage;
import ObjectRepository.HomePage;
import ObjectRepository.OrgHomePage;
import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.ListenersImplementationClass;
import genericUtilityOrLib.javaUtility;
@Listeners(ListenersImplementationClass.class)
public class OG_01 extends BaseClass{
	@Test(groups= {"regression"})
	public void og_01() throws Exception
	{
	javaUtility JUTIL = new javaUtility();
	int num= JUTIL.getRandomNumber(1000);
	ExcelUtility EUTIL= new ExcelUtility();
	String ORGNAME=EUTIL.readDataFromExcel("Organisation", 1, 1);
	String WEBSITE=EUTIL.readDataFromExcel("Organisation", 1, 2);
	String EMPLOYEE=EUTIL.readDataFromExcel("Organisation", 1, 3);
	
	HomePage hp= new HomePage(driver);
	hp.clickOnOrg();
	OrgHomePage og= new OrgHomePage(driver);
	og.clickOnNewOrg();
	CreateNewOrgPage op= new CreateNewOrgPage(driver);
	op.createOrganisation(ORGNAME+num, WEBSITE, EMPLOYEE);
	Thread.sleep(3000);
	
	}
}
