package pageobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponent.abstractcomponent;

public class SignUp extends abstractcomponent{
	
	public WebDriver driver;
	public SignUp (WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (xpath="//input[@placeholder='First name']")
	WebElement firstName;
	@FindBy (xpath="//input[@placeholder='Last name']")
	WebElement lastName;
	@FindBy (xpath="//input[@placeholder='Email']")
	WebElement email_Id;
	@FindBy (xpath="//input[@placeholder='Password']")
	WebElement pass;
	@FindBy (xpath="//button[normalize-space()='Sign up'")
	WebElement signup;
	
	public void SignUpData() throws IOException, InterruptedException
	{
		Properties prop=new Properties();
		FileInputStream fsi=new FileInputStream((System.getProperty("user.dir")+"\\src\\main\\java\\resources\\globaldata.properties"));
		prop.load(fsi);
		String firstname=prop.getProperty("firstname");
		String lastname=prop.getProperty("lastname");
		String email=prop.getProperty("email");
		String password=prop.getProperty("password");
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		email_Id.sendKeys(email);
		pass.sendKeys(password);
		Thread.sleep(5000);//	signup.click();
	}
	


}