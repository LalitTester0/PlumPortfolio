package pageobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponent.abstractcomponent;

public class LoginPage extends abstractcomponent{
	//locator -initiate the webdriver
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);//PREDEFINE CLASS APPLICABLE FOR ALL ELEMENT
	}
	@FindBy (id="email")
	WebElement emailid;
	@FindBy (id="password")
	WebElement password;
	@FindBy(xpath="//span[text()=' Sign up']")
	WebElement signUp;
	
	public void loginData() throws IOException {
		Properties prop=new Properties();
		FileInputStream fsi=new FileInputStream((System.getProperty("user.dir")+"\\src\\main\\java\\resources\\globaldata.properties"));
		prop.load(fsi);
		String user1=prop.getProperty("username");
		String pass1=prop.getProperty("password");
		emailid.sendKeys(user1);
		password.sendKeys(pass1);
	}
	
	public SignUp navigateToSignUp() {
		Actions act=new Actions(driver);
		act.click(signUp).perform();
		SignUp sign=new SignUp(driver);
		return sign;
	}
	
	
	
	public void goTo()throws IOException, InterruptedException {
		Properties prop=new Properties();
		FileInputStream fsi=new FileInputStream((System.getProperty("user.dir")+"\\src\\main\\java\\resources\\globaldata.properties"));
		prop.load(fsi);
		String link=prop.getProperty("url");
		driver.get(link);
		Thread.sleep(3000);
	}

}
