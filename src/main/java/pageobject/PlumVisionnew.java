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
	public PlumVisionnew (WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);//PREDEFINE CLASS APPLICABLE FOR ALL ELEMENT
	
	
	}
	
	@FindBy( xpath="//img[@alt='xlsx']")
	WebElement csv;
	@FindBy (xpath="//input[@placeholder='Start Date']")
	WebElement startdate;
	@FindBy (xpath="//input[@placeholder='End Date']")
	WebElement enddate;
	@FindBy(xpath="//div[contains(@class,'_playBtnDiv')]")
	WebElement playbutton;
	
	public void CsvFileupload() throws AWTException, InterruptedException {
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", csv);    //click on img
		//fileelement.click();

		Robot rb=new Robot();
		rb.delay(2000);

		StringSelection ss=new StringSelection("C:\\Users\\vidya\\Downloads\\portfolio_updated 1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//ctr v action
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
	public void Startdate() throws InterruptedException {
		
			Thread.sleep(5000);
			startdate.click();
			
			startdate.sendKeys("2024/06/01");
			System.out.println("***");
			enddate.sendKeys("2024/06/30");
			System.out.println("****");
			enddate.sendKeys(Keys.ENTER);
			playbutton.click();
			System.out.println("*****");
	}
	
	

}
