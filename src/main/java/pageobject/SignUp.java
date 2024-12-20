package pageobject;

import java.io.FileInputStream;

import org.testng.Assert;
import java.io.IOException;
import java.util.Properties;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

import abstractcomponent.abstractcomponent;

public class SignUp extends abstractcomponent {
	public WebDriver driver;

	public SignUp(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='First name']")
	WebElement firstName;
	@FindBy(xpath = "//input[@placeholder='Last name']")
	WebElement lastName;
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email_Id;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pass;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signup;
	@FindBy(xpath="//div[@class='Toastify']")
	WebElement toast;

	public void SignUpData() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fsi = new FileInputStream(
		(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\globaldata.properties"));
		prop.load(fsi);
		String firstname = prop.getProperty("firstname");
		String lastname = prop.getProperty("lastname");
		String email = randomstring();
		String password = prop.getProperty("password");
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		email_Id.sendKeys(email);
		pass.sendKeys(password);
		signup.click();
		
	}

	public String randomstring() {
		Faker random = new Faker();
		String firstname = random.name().firstName();
		String lastname = random.name().lastName();
		String email = firstname.toLowerCase() + "" + lastname.toLowerCase() + "@gmail.com";
		return email;
	}

	public void NewSignUpData() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fsi = new FileInputStream(
		(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\globaldata.properties"));
		prop.load(fsi);
		String firstname = prop.getProperty("firstname1");
		String lastname = prop.getProperty("lastname2");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		email_Id.sendKeys(email);
		pass.sendKeys(password);
		signup.click();

	}

	public String duplicateMailidvalidation() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fsi = new FileInputStream(
		(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\globaldata.properties"));
		prop.load(fsi);
		String firstname = prop.getProperty("firstname1");
		String lastname = prop.getProperty("lastname2");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		email_Id.sendKeys(email);
		pass.sendKeys(password);
		signup.click();
		Thread.sleep(3000);
		return toast.getText();

	}

	

}
