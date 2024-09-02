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
public class LE_04 extends BaseClass {
	@Test(groups= {"smoke"})
	public void le_04Case() throws Exception {
		javaUtility JUTIL = new javaUtility();
		int num= JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL= new ExcelUtility();
		String FIRSTNAME= EUTIL.readDataFromExcel("Leads", 13, 1);
		String LASTNAME= EUTIL.readDataFromExcel("Leads",13,2);
	    String COMPANY= EUTIL.readDataFromExcel("Leads",13, 3);
	    String STREET= EUTIL.readDataFromExcel("Leads",13, 4);
	    String POBOX= EUTIL.readDataFromExcel("Leads",13, 5);
	    String POSTALCODE= EUTIL.readDataFromExcel("Leads",13, 6);
	    String CITY= EUTIL.readDataFromExcel("Leads",13, 7);
	    String COUNTRY= EUTIL.readDataFromExcel("Leads",13, 8);
	    String STATE= EUTIL.readDataFromExcel("Leads",13, 9);
	    HomePage hp = new HomePage(driver);
	    hp.clickOnLeads();
	    LeadsHomePage lp= new LeadsHomePage(driver);
	    lp.clickOnNewLeadsButton();
	    CreateNewLeadsPage cn= new CreateNewLeadsPage(driver);
	    cn.createLeads(FIRSTNAME+num, LASTNAME, COMPANY,STREET,POBOX,POSTALCODE,CITY,COUNTRY,STATE);
	    Thread.sleep(4000);
	}
    

}
