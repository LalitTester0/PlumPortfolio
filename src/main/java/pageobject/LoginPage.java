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

public class LoginPage extends abstractcomponent {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	WebElement emailid;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Sign in']")
	WebElement signin;
	@FindBy(xpath = "//span[text()=' Sign up']")
	WebElement signup;
	@FindBy(xpath = "//div[text()='Invalid email or password']")
	WebElement invalidUser1;
	@FindBy(xpath = "//div[@class=\"Toastify__toast-body\"]//div[2]")
	WebElement invalidUser;
	@FindBy(xpath = "//input[@id='password']")
	WebElement entercorrectuser;

	public DashBoard entervalidLoginData() throws IOException {
		Properties prop = new Properties();
		FileInputStream fsi = new FileInputStream(
		(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\globaldata.properties"));
		prop.load(fsi);
		String user1 = prop.getProperty("username");
		String pass1 = prop.getProperty("password");
		emailid.sendKeys(user1);
		password.sendKeys(pass1);
		signin.click();
		DashBoard dd = new DashBoard(driver);
		return dd;
	}
	
	public WebElement emailidWeblelemnent() {
		return emailid;
	}

	public String enterinvalidloginData() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fsi = new FileInputStream(
		(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\globaldata.properties"));
		prop.load(fsi);
		String user1 = prop.getProperty("wrongusername");
		String pass1 = prop.getProperty("wrongpassword");
		emailid.sendKeys(user1);
		password.sendKeys(pass1);
		signin.click();
		Thread.sleep(2000);
		return invalidUser.getText();
	}

	

	public SignUp navigateToSignUp() {
		Actions act = new Actions(driver);
		act.click(signup).perform();
		SignUp sign = new SignUp(driver);
		return sign;
	}

	public DashBoard goTo() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fsi = new FileInputStream(
		(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\globaldata.properties"));
		prop.load(fsi);
		String link = prop.getProperty("url");
		driver.get(link);
		Thread.sleep(3000);
		return null;
	}

	public void NewUserlogin() throws IOException {
		Properties prop = new Properties();
		FileInputStream fsi = new FileInputStream(
		(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\globaldata.properties"));
		prop.load(fsi);
		String user1 = prop.getProperty("newusername");
		String pass1 = prop.getProperty("newpassword");
		emailid.sendKeys(user1);
		password.sendKeys(pass1);
		signin.click();
	}
	
	public DashBoard enterSenderLoginData() throws IOException {
		emailid.sendKeys("sender1@gmail.com");
		password.sendKeys("Test@123");
		signin.click();
		DashBoard dd = new DashBoard(driver);
		return dd;
	}
	
	public DashBoard enterReceiverLoginData() throws IOException {
		emailid.sendKeys("receiver1@gmail.com");
		password.sendKeys("Test@123");
		signin.click();
		DashBoard dd = new DashBoard(driver);
		return dd;
	}

}
