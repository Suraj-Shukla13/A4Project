package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	/*
	 * This is Pom class for login page to overcome the problem of stale element
	 */
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return loginBtn;
	}
	/**
	 * this is a method to do the login operation
	 * @param uname
	 * @param Pass
	 */
	
	public void loginOperation(String uname, String Pass)
	{
		username.sendKeys(uname);
		password.sendKeys(Pass);
		loginBtn.click();
	
	}
	

}
