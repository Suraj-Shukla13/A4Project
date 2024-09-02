package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this is a pom class to create leads.
 * @author Suraj Shukla
 *
 */
public class CreateNewLeadsPage {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	@FindBy(xpath = "//input[@name='designation']")
	private WebElement title;
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@name='noofemployees']")
	private WebElement noOfEmployee;
	@FindBy(xpath = "//textarea[@name='lane']")
	private WebElement street;
	@FindBy(xpath = "//input[@name='pobox']")
	private WebElement poBox;
	@FindBy(xpath = "//input[@name='code']")
	private WebElement postalCode;
	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;
	@FindBy(xpath = "//input[@name='country']")
	private WebElement country;
	@FindBy(xpath = "//input[@name='state']")
	private WebElement state;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn;

	public CreateNewLeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNoOfEmployee() {
		return noOfEmployee;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	/**
	 * this is test case 1
	 * 
	 * @param firstN
	 * @param lastN
	 * @param cmp
	 */
	public void createLeads(String firstN, String lastN, String cmp) {
		firstName.sendKeys(firstN);
		lastName.sendKeys(lastN);
		company.sendKeys(cmp);
		saveBtn.click();
	}

	/**
	 * this is testcase 2
	 * @param firstN
	 * @param lastN
	 * @param cmp
	 * @param moble
	 * @param emil
	 * @param noOfEp
	 * @param stt
	 * @param poBx
	 * @param postCode
	 * @param ct
	 * @param count
	 * @param sts
	 */

	public void createLeads(String firstN, String lastN,String tit, String cmp, String moble,String phn, String emil, String noOfEp,
			String stt, String poBx, String postCode, String ct, String count, String sts) {
		firstName.sendKeys(firstN);
		lastName.sendKeys(lastN);
		company.sendKeys(cmp);
		title.sendKeys(tit);
		phone.sendKeys(phn);
		mobile.sendKeys(moble);
		email.sendKeys(emil);
		noOfEmployee.sendKeys(noOfEp);
		street.sendKeys(stt);
		poBox.sendKeys(poBx);
		postalCode.sendKeys(postCode);
		city.sendKeys(ct);
		country.sendKeys(count);
		state.sendKeys(sts);
		saveBtn.click();
		
	}
		
		public void createLeads(String firstN, String lastN,String tit, String cmp, String moble,String phn, String emil,String noOfEp) {
			firstName.sendKeys(firstN);
			lastName.sendKeys(lastN);
			company.sendKeys(cmp);
			title.sendKeys(tit);
			phone.sendKeys(phn);
			mobile.sendKeys(moble);
			email.sendKeys(emil);
			noOfEmployee.sendKeys(noOfEp);
			saveBtn.click();
		}
			public void createLeads(String firstN, String lastN, String cmp,String stt, String poBx, String postCode,String ct, String count, String sts) {
				firstName.sendKeys(firstN);
				lastName.sendKeys(lastN);
				company.sendKeys(cmp);
				street.sendKeys(stt);
				poBox.sendKeys(poBx);
				postalCode.sendKeys(postCode);
				city.sendKeys(ct);
				country.sendKeys(count);
				state.sendKeys(sts);
		

	}

}
