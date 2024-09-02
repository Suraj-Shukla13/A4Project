package tc_Repository;

import org.openqa.selenium.WebDriver;
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
public class LE_03 extends BaseClass {
	@Test(groups= {"regression"})
	public void le_01Case() throws Exception {
		//WebDriver driver = null;
		javaUtility JUTIL = new javaUtility();
		int num= JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL= new ExcelUtility();
		String FIRSTNAME= EUTIL.readDataFromExcel("Leads", 9, 1);
		String LASTNAME= EUTIL.readDataFromExcel("Leads",9,2);
	    String COMPANY= EUTIL.readDataFromExcel("Leads",9, 3);
	    String TITLE= EUTIL.readDataFromExcel("Leads",9, 4);
	    String PHONE= EUTIL.readDataFromExcel("Leads",9, 5);
	    String MOBILE= EUTIL.readDataFromExcel("Leads",9, 6);
	    String EMAIL= EUTIL.readDataFromExcel("Leads",9, 7);
	    String NOOFEMPLOYEE= EUTIL.readDataFromExcel("Leads",9, 8);
	    HomePage hp = new HomePage(driver);
	    hp.clickOnLeads();
	    LeadsHomePage lp= new LeadsHomePage(driver);
	    lp.clickOnNewLeadsButton();
	    CreateNewLeadsPage cn= new CreateNewLeadsPage(driver);
	    cn.createLeads(FIRSTNAME+num, LASTNAME, COMPANY,TITLE,PHONE,MOBILE,EMAIL,NOOFEMPLOYEE);
	    Thread.sleep(4000);
	}

}
