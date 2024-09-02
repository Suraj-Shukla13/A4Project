package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Lenovo
 *
 */
public class CreateNewOrgPage {
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgName;
	@FindBy(xpath="//input[@name='website']")
	private WebElement websiteName;
	@FindBy(xpath="//input[@name='employees']")
	private WebElement employees;
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement otherphn;
	@FindBy(xpath="//input[@name='email1']")
	private WebElement email;
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingAdress;
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement billingCity;
	@FindBy(xpath="//input[@name='bill_state']")
    private WebElement billingState;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'][1])")
	private WebElement saveButton;
	
	public CreateNewOrgPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebsiteName() {
		return websiteName;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getOtherphn() {
		return otherphn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingAdress() {
		return billingAdress;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}
	/**
	 * 
	 * @param organisationName
	 * @param web
	 * @param emp
	 */
	public void createOrganisation(String organisationName, String web,String emp)
	{
		orgName.sendKeys(organisationName);
		websiteName.sendKeys(web);
		employees.sendKeys(emp);
		saveButton.click();
	}
	/**
	 * 
	 * @param organisationName
	 * @param web
	 * @param emp
	 * @param phn
	 * @param othPhn
	 * @param eml
	 */
	public void createOrganisation(String organisationName, String web,String emp,String phn,String othPhn, String eml)
	{
		orgName.sendKeys(organisationName);
		websiteName.sendKeys(web);
		employees.sendKeys(emp);
		phone.sendKeys(phn);
		otherphn.sendKeys(othPhn);
		email.sendKeys(eml);
		saveButton.click();
	
	}
	
	/**
	 * 
	 * @param organisationName
	 * @param web
	 * @param emp
	 * @param phn
	 * @param othPhn
	 * @param eml
	 * @param billingAds
	 * @param billingSts
	 * @param ct
	 */
	public void createOrganisation(String organisationName, String web,String billingAds, String billingSts,String ct)
	{
		orgName.sendKeys(organisationName);
		websiteName.sendKeys(web);
		billingAdress.sendKeys(billingAds);
	    billingState.sendKeys(billingSts);
	    billingCity.sendKeys(ct);
	    saveButton.click();
		
	}
	/**
	 * 
	 * @param organisationName
	 * @param web
	 * @param emp
	 * @param phn
	 * @param othPhn
	 * @param eml
	 * @param billingAds
	 * @param billingSts
	 * @param ct
	 */
	public void createOrganisation(String organisationName, String web,String emp,String phn,String othPhn, String eml,
			String billingAds, String billingSts,String ct)
	{
		orgName.sendKeys(organisationName);
		websiteName.sendKeys(web);
		employees.sendKeys(emp);
		phone.sendKeys(phn);
		otherphn.sendKeys(othPhn);
		email.sendKeys(eml);
	    billingAdress.sendKeys(billingAds);
	    billingState.sendKeys(billingSts);
	    billingCity.sendKeys(ct);
	    saveButton.click();
	}
	
	
	
	
		
	
	
	

}
