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
	
	@FindBy(xpath="//div[text()='PLUM Vision']")
	WebElement PLUMVISION ;
	
	@FindBy(xpath="//div[text()='Correlate']")
	WebElement CORRELATE;
	
	@FindBy(xpath="//div[text()='Target']")
	WebElement TARGET;
	
	@FindBy(xpath="//div[text()='Auto Hedge']")
	WebElement AUTOHEDGE;
	
	@FindBy(xpath="//div[text()='FORGE']")
	WebElement FORGE;
	
	@FindBy(xpath="//div[text()='Cost Basis']")
	WebElement COST ;
	
	public AppStore DashBoard() {
		
		appstore.click();
		
		AppStore app=new AppStore(driver);
		return app;
		
		
		
	}
	
	public void Sixmoduledisplay() throws InterruptedException {
		
		Thread.sleep(5000);
		appstore.click();
		System.out.println(PLUMVISION.getText()) ;
		System.out.println(CORRELATE.getText());
		System.out.println(TARGET.getText());
		System.out.println(AUTOHEDGE.getText());
		System.out.println(FORGE.getText());
		System.out.println(COST.getText());
	//	return PLUMVISION.getText();
		
		
	}
	
	
	
	
	
	}
	





















