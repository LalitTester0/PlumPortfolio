package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponent.abstractcomponent;

public class AppStore extends abstractcomponent {
	
	
	
	public WebDriver driver;
	public AppStore (WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);//PREDEFINE CLASS APPLICABLE FOR ALL ELEMENT

	}

	@FindBy (xpath="//div[normalize-space()='PLUM Vision']")
	WebElement plumvision;
	
	
	
	
	public void PlumVision()
	{
		
		plumvision.click();
	}
	
	
	
	
	
	
	
	
}
