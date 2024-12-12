package pageobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponent.abstractcomponent;

public class DashBoard extends abstractcomponent {
	
	
	
	
	public WebDriver driver;
	public DashBoard (WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);//PREDEFINE CLASS APPLICABLE FOR ALL ELEMENT

}
	@FindBy (xpath="//*[name()='svg']/*[name()='circle'][1]")
	WebElement appstore;
	
	public AppStore DashBoard() {
		
		appstore.click();
		
		AppStore app=new AppStore(driver);
		return app;
		
		
		
	}
	
	
	
	
	}
	





















