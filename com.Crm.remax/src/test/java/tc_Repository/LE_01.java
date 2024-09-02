package tc_Repository;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.CreateNewLeadsPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsHomePage;
import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.ListenersImplementationClass;
import genericUtilityOrLib.javaUtility;

@Listeners(ListenersImplementationClass.class)
public class LE_01 extends BaseClass {
	
	@Test(retryAnalyzer = genericUtilityOrLib.RetrynalyzerImplementationClass.class)
	public void le_01Case() throws Exception {
		javaUtility JUTIL = new javaUtility();
		int num= JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL= new ExcelUtility();
		String FIRSTNAME= EUTIL.readDataFromExcel("Leads", 1, 1);
		String LASTNAME= EUTIL.readDataFromExcel("Leads",1,2);
	    String COMPANY= EUTIL.readDataFromExcel("Leads",1, 3);
	    HomePage hp= new HomePage(driver);
	    hp.clickOnLeads();
	    LeadsHomePage lp= new LeadsHomePage(driver);
	    lp.clickOnNewLeadsButton();
	    CreateNewLeadsPage cn= new CreateNewLeadsPage(driver);
	    cn.createLeads(FIRSTNAME + num, LASTNAME, COMPANY);
	    Thread.sleep(5000);
	}

}
