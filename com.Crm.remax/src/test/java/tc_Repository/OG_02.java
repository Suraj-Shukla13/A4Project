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
public class OG_02 extends BaseClass {
	    @Test(groups= {"regression"})
	    public void OG_02Case() throws Exception {
		javaUtility JUTIL = new javaUtility();
		int num= JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL= new ExcelUtility();
		String ORGNAME=EUTIL.readDataFromExcel("Organisation", 5, 1);
		String WEBSITE=EUTIL.readDataFromExcel("Organisation", 5, 2);
		String EMPLOYEE=EUTIL.readDataFromExcel("Organisation", 5, 3);
		String PHONE=EUTIL.readDataFromExcel("Organisation", 5, 4);
		String OTHERPHONE=EUTIL.readDataFromExcel("Organisation", 5, 5);
		String EMail=EUTIL.readDataFromExcel("Organisation", 5, 6);
		
		
		HomePage hp= new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage og= new OrgHomePage(driver);
		og.clickOnNewOrg();
		CreateNewOrgPage op= new CreateNewOrgPage(driver);
		op.createOrganisation(ORGNAME+num, WEBSITE, EMPLOYEE, PHONE, OTHERPHONE, EMail);
		Thread.sleep(3000);
	    }
		

}
