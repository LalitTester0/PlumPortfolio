package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponent.abstractcomponent;

public class DashBoard extends abstractcomponent {

	public WebDriver driver;

	public DashBoard(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[name()='svg']/*[name()='circle'][1]")
	WebElement appstore;
	@FindBy(xpath = "//div[text()='PLUM Vision']")
	WebElement PLUMVISION;
	@FindBy(xpath = "//div[text()='Correlate']")
	WebElement CORRELATE;
	@FindBy(xpath = "//div[text()='Target']")
	WebElement TARGET;
	@FindBy(xpath = "//div[text()='Auto Hedge']")
	WebElement AUTOHEDGE;
	@FindBy(xpath = "//div[text()='FORGE']")
	WebElement FORGE;
	@FindBy(xpath = "//div[text()='Cost Basis']")
	WebElement COST;

	public AppStore clickOnAppstoreBtn() {
		appstore.click();
		AppStore app = new AppStore(driver);
		return app;
	}
	public WebElement AppstoreWebelement() {
		return appstore;
	}

	public void Sixmoduledisplay() throws InterruptedException {
		Thread.sleep(5000);
		appstore.click();
		System.out.println(PLUMVISION.getText());
		System.out.println(CORRELATE.getText());
		System.out.println(TARGET.getText());
		System.out.println(AUTOHEDGE.getText());
		System.out.println(FORGE.getText());
		System.out.println(COST.getText());
	}

}
