package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class for leads home page
 * @author Suraj Shukla
 *
 */

public class LeadsHomePage {
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createLeadButton;

	public LeadsHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateLeadButton() {
		return createLeadButton;
	}
	/**
	 * this is the buisness library to click on btn
	 */
	
	public void clickOnNewLeadsButton()
	{
		createLeadButton.click();
	}
	
	

}
