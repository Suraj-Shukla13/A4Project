
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
public class OG_04 extends BaseClass{
	@Test
    public void og_04() throws Exception
    {
		javaUtility JUTIL = new javaUtility();
		int num= JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL= new ExcelUtility();
		String ORGNAME=EUTIL.readDataFromExcel("Organisation", 13, 1);
		String WEBSITE=EUTIL.readDataFromExcel("Organisation", 13, 2);
		String EMPLOYEE=EUTIL.readDataFromExcel("Organisation", 13, 3);
		String PHONE=EUTIL.readDataFromExcel("Organisation", 13, 4);
		String OTHERPHONE=EUTIL.readDataFromExcel("Organisation", 13, 5);
		String EMail=EUTIL.readDataFromExcel("Organisation", 13, 6);
		String BILLINGADRESS=EUTIL.readDataFromExcel("Organisation", 13, 7);
		String BLLINGCITY=EUTIL.readDataFromExcel("Organisation", 13, 8);
		String BILLINGSTATE=EUTIL.readDataFromExcel("Organisation", 13,9);
		
		HomePage hp= new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage og= new OrgHomePage(driver);
		og.clickOnNewOrg();
		CreateNewOrgPage op= new CreateNewOrgPage(driver);
		op.createOrganisation(PHONE, WEBSITE, EMPLOYEE, OTHERPHONE, BLLINGCITY, EMail, 
				BILLINGADRESS,ORGNAME+num, BILLINGSTATE);
		Thread.sleep(3000);
    }
}
