package pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import abstractcomponent.abstractcomponent;

public class PlumVisionnew extends abstractcomponent {

	public WebDriver driver;
	public PlumVisionnew(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);// PREDEFINE CLASS APPLICABLE FOR ALL ELEMENT
	}

	@FindBy(xpath = "//img[@alt='xlsx']")
	WebElement csv;
	@FindBy(xpath = "//input[@placeholder='Start Date']")
	WebElement startdate;
	@FindBy(xpath = "//input[@placeholder='End Date']")
	WebElement enddate;
	@FindBy(xpath = "//div[contains(@class,'_playBtnDiv')]")
	WebElement playbutton;
	@FindBy(xpath = "//div[contains(text(),'An error occurred while uploading the file. Please try again.')]")
	WebElement wrongfile;
	@FindBy(xpath="//div[@class='Toastify']")
	WebElement toast;
	
	public WebElement csvWebelement() {
		return csv;
	}
	public void uploadCsvFile() throws AWTException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", csv); 
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\portfolio_updated 1 2");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public String getSuccessfullUploadtext() throws InterruptedException {
		Thread.sleep(7000);
		System.out.println(toast.getText());
		return toast.getText();
	}

	public void enterValidParameter() throws InterruptedException {
		Thread.sleep(5000);
		startdate.click();
		startdate.sendKeys("2024/06/01");
		enddate.sendKeys("2024/06/30");
		enddate.sendKeys(Keys.ENTER);
	}
	
	public BackTestAssetAllocation navigatetoBackTestAssetAllocation() throws AWTException, InterruptedException {
		uploadCsvFile();
		enterValidParameter();
		BackTestAssetAllocation play = clickonplaybutton();
		return play;
	}
	public BackTestAssetAllocation navigatetoBackTestAssetAllocation2() throws AWTException, InterruptedException {
		uploadCsvFile();
		enterNoneValidParameter();
		BackTestAssetAllocation play = clickonplaybutton();
		return play;
	}
	public BackTestAssetAllocation clickonplaybutton() throws InterruptedException {
		playbutton.click();
		Thread.sleep(2000);
		BackTestAssetAllocation back=new BackTestAssetAllocation(driver);
		return back;
	}
	
	public void enterNoneValidParameter() throws InterruptedException {
		Thread.sleep(5000);
		startdate.click();
		startdate.sendKeys("2025/01/01");
		enddate.sendKeys("2025/01/30");
		enddate.sendKeys(Keys.ENTER);
	}
	

	public String Wrongfileupload() throws AWTException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", csv); 
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\PFLT-Borrowing_Base_Report (26)");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(7000);
		return wrongfile.getText();
	}

}
