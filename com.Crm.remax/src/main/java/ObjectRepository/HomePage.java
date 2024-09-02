package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityOrLib.SeleniumUtility;
/**
 * 
 * @author Suraj Shukla
 *
 */

public class HomePage {
	@FindBy(xpath="(//a[text()='Leads'])[1]")
	private WebElement Leads;
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement org;
	@FindBy(xpath="(//td[@class='small'])[2]")
	private WebElement prefrences;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutOption;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeads() {
		return Leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getPrefrences() {
		return prefrences;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
	public void clickOnLeads()
	{
		Leads.click();
	}
	public void clickOnOrg()
	{
		org.click();
	}
	/**
	 * this is a buisness lib to logout
	 * @throws Exception
	 */
	public void logOutOperation(WebDriver driver)throws Exception
	{
		SeleniumUtility SUTIL= new SeleniumUtility();
		SUTIL.moveCursorToElement(driver,prefrences);
		Thread.sleep(3000);
		SUTIL.moveCursorToElement(driver,signoutOption);
		Thread.sleep(2000);
		SUTIL.clickOnElement(driver, signoutOption);
	}
	

}
