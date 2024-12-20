package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponent.abstractcomponent;

public class Homepage extends abstractcomponent{

	public WebDriver driver;

	public Homepage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='Toastify']")
	WebElement toast;
	@FindBy(xpath="//*[local-name()='svg']")
	WebElement loginIcon;
	
	public String toastmessage() throws InterruptedException {
		Thread.sleep(3000);
		return toast.getText();
	}
	public LoginPage navigatetoLogin() throws InterruptedException {
		Thread.sleep(3000);
		loginIcon.click();
		LoginPage page=new LoginPage(driver);
		return page;
	}
	
	
	
	
}
