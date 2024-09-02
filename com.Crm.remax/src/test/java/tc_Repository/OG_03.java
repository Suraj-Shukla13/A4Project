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
public class OG_03 extends BaseClass{
	@Test(groups= {"regression"})
	    public void OG_03() throws Exception{
		javaUtility JUTIL = new javaUtility();
		int num= JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL= new ExcelUtility();
		String ORGNAME=EUTIL.readDataFromExcel("Organisation", 9, 1);
		String WEBSITE=EUTIL.readDataFromExcel("Organisation", 9, 2);
		String BILLINGADRESS=EUTIL.readDataFromExcel("Organisation", 9, 7);
		String BLLINGCITY=EUTIL.readDataFromExcel("Organisation", 9, 8);
		String BILLINGSTATE=EUTIL.readDataFromExcel("Organisation", 9,9);
		
		HomePage hp= new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage og= new OrgHomePage(driver);
		og.clickOnNewOrg();
		CreateNewOrgPage op= new CreateNewOrgPage(driver);
		op.createOrganisation(BILLINGADRESS, WEBSITE, BLLINGCITY, ORGNAME+num, BILLINGSTATE);
		Thread.sleep(3000);
	}

}
