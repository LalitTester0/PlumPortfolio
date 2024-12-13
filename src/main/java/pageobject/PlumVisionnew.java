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
		
		WebElement strtdate=driver.findElement(By.xpath("//input[@placeholder='Start Date']"));
		Thread.sleep(10000);

		strtdate.click();
		strtdate.sendKeys("2024/06/01");
		WebElement enddate=driver.findElement(By.xpath("//input[@placeholder='End Date']"));
		enddate.sendKeys("2024/06/30");
		enddate.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(@class,'_playBtnDiv')]")).click();
		Thread.sleep(5000);
	}
	
	

}
