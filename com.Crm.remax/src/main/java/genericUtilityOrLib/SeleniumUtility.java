 package genericUtilityOrLib;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	Actions act = null;
	Select s = null;

	/**
	 * this method is to give implicit wait to the element
	 * 
	 * @param particularSeconds
	 */
	public void implicitWait(WebDriver driver, int particularSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));

	}

	/**
	 * this method is to maximize the window
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * this method is to right click on an element
	 * 
	 * @param element
	 */
	public void rightClickOnElement(WebDriver driver,WebElement element) {
		act = new Actions(driver);
		act.contextClick(element).perform();
	}

	/**
	 * this method is to click on an element
	 * 
	 * @param element
	 */
	public void clickOnElement(WebDriver driver,WebElement element) {
		act = new Actions(driver);
		act.click(element).perform();
	}

	public void dragAndDropElement(WebDriver driver,WebElement src, WebElement target) {
		act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}

	/**
	 * this method is
	 * 
	 * @param src
	 * @param xoffset
	 * @param yoffset
	 */
	public void dragAPointer(WebDriver driver,WebElement src, int xoffset, int yoffset) {
		act = new Actions(driver);
		act.dragAndDropBy(src, xoffset, yoffset).perform();
	}

	/**
	 * this methos is to scroll till particular element
	 * 
	 * @param element
	 */
	public void scrollToElement(WebDriver driver,WebElement element) {
		act = new Actions(driver);
		act.scrollToElement(element).perform();
	}

	/**
	 * this method is to move the cursor to the particular element
	 * 
	 * @param element
	 */
	public void moveCursorToElement(WebDriver driver,WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * this method is to click and hold the element
	 * 
	 * @param element
	 */
	public void holdAnElement(WebDriver driver,WebElement element) {
		act = new Actions(driver);
		act.clickAndHold(element).perform();
	}

	/**
	 * This method is to release the control from element
	 * 
	 * @param element
	 */
	public void releaseAnElement(WebDriver driver,WebElement element) {
		act = new Actions(driver);
		act.release(element).perform();

	}

	/*------------Select-----------*/
	/**
	 * this method is to handle the dropdown and select with the help of index
	 * 
	 * @param element
	 */
	public void selectElementByIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}

	/**
	 * this method is to select the particular element in the dropdown using visible
	 * text
	 * 
	 * @param element
	 * @param text
	 */
	public void selectElementByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	/**
	 * this method is to select the particular element in the dropdown using value
	 * 
	 * @param element
	 * @param value
	 */
	public void selectByValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}

	/**
	 * this method is to handle the dropdown and deselect with the help of index
	 * 
	 * @param element
	 */
	public void deSelectElementByIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}

	/**
	 * this method is to deselect the particular element in the dropdown using
	 * visible text
	 * 
	 * @param element
	 * @param text
	 */
	public void deSelectElementByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	/**
	 * this method is to deselect the particular element in the dropdown using value
	 * 
	 * @param element
	 * @param value
	 */
	public void deSelectByValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}

	/**
	 * this is to deselect all option in the
	 * 
	 * @param element
	 */
	public void deselectAllOption(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}

	/**
	 * this is to select all the option in dropdown
	 * 
	 * @param element
	 * @return
	 */
	public List<WebElement> fetchAllSelectedOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> all = s.getAllSelectedOptions();
		return all;
	}

	/**
	 * this is fetch all the options from the dropdown
	 * 
	 * @param element
	 * @return
	 */
	public List<WebElement> fetchOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> all = s.getOptions();
		return all;
	}

	/**
	 * this will fetch first option from the dropdown32.23
	 * 
	 * @param element
	 */
	public void firstSelectedOption(WebElement element) {
		s = new Select(element);
		s.getFirstSelectedOption();
	}

	/*-----------alert---------*/
	/**
	 * this method is to accept the alert
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * this is to dismiss the alert
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * this methos is to switch to child frame
	 * 
	 * @param ChildFrameindex
	 */
	public void switchToChildFrame(WebDriver driver,int ChildFrameindex) {
		driver.switchTo().frame(ChildFrameindex);
	}

}
