package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponent.abstractcomponent;

public class BackTestAssetAllocation extends abstractcomponent {
	
	public WebDriver driver;
	public BackTestAssetAllocation (WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);//PREDEFINE CLASS APPLICABLE FOR ALL ELEMENT
	}
	
	
	@FindBy(xpath="//div[text()='Asset Allocation']")
	WebElement source1;
	@FindBy(xpath="//div[@class='_dropChartContainer_pl9cj_11']")
	WebElement destination1;
	
	public void Drag1() throws InterruptedException
	{
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source1, destination1).perform();
		Thread.sleep(10000);
	}
	
	

}
