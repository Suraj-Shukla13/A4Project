package genericUtilityOrLib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseClass {
	
	protected static WebDriver driver= null;
	SeleniumUtility SUTIL=null;
	PropertiesUtil PUTIL=new PropertiesUtil();
	
	@BeforeSuite(alwaysRun=true)
	public void createConnection() {
		System.out.println("Connection established!!");
	}
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() throws IOException
	{
		String URL= PUTIL.getDataFromProperties("url");
		SUTIL=new SeleniumUtility();
		driver=new ChromeDriver();
		SUTIL.implicitWait(driver, 10);
		SUTIL.maximizeWindow(driver);
		driver.get(URL);
		System.out.println("launch success!!");
	}
	@BeforeClass(alwaysRun=true)
	public void loginApp() throws IOException
	{
		String USERNAME=PUTIL.getDataFromProperties("username");
		String PASSWORD=PUTIL.getDataFromProperties("password");
		LoginPage lp= new LoginPage(driver);
		lp.loginOperation(USERNAME, PASSWORD);
		System.out.println("Login password!!");
	}
	@AfterMethod(alwaysRun=true)
	public void logoutApp() throws Exception
	{
		HomePage hp= new HomePage(driver);
		hp.logOutOperation(driver);
		System.out.println("logout successful");
	}
	@AfterClass(alwaysRun=true)
	public void closeApp()
	{
		driver.quit();
		System.out.println("browser closed succesfully");
	}
	
	@AfterSuite(alwaysRun=true)
	
	public void closeConnection()
	{
		System.out.println("connection closed");
	}
	
	
	

}
