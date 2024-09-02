package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * this is the pom class to create org
 * @author suraj shukla
 *
 */

public class OrgHomePage {
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrgButton;

	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOrgButton() {
		return createOrgButton;
	}
	/**
	 * this is the buisness library to click on btn
	 * 
	 */
	
	public void clickOnNewOrg()
	{
		createOrgButton.click();
	}

}
