package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponent.abstractcomponent;

public class BackTestAssetAllocation extends abstractcomponent {

	public WebDriver driver;

	public BackTestAssetAllocation(WebDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Asset Allocation']")
	WebElement assetAllocation;
	@FindBy(xpath = "//div[@class='_dropChartContainer_pl9cj_11']")
	WebElement dropcontainer;
	@FindBy(xpath = "//div[contains(text(),'Asset Performance')]/parent::div")
	WebElement assetperformance;
	@FindBy(xpath = "//div[contains(@class,'_chartContainer_')]")
	WebElement dropcontainer1;
	@FindBy(xpath = "//div[contains(text(),'Drawdown')]")
	WebElement drawdown;
	@FindBy(xpath = "//div[contains(@class,'_chartContainer_')]")
	WebElement dropcontainer2;
	@FindBy(xpath = "//div[contains(text(),'Portfolio Growth')]")
	WebElement portfoliogrowth;
	@FindBy(xpath = "//div[text()='Drop a chart type to display it here.']")
	WebElement dropcontainer3;
	@FindBy(xpath = "//div[contains(text(),'Monthly Pnl Heatmap')]")
	WebElement monthlypnlheatmap;
	@FindBy(xpath = "//div[contains(@class,'_chartContainer_')]")
	WebElement dropcontainer4;
	@FindBy(xpath = "//div[contains(text(),'Monthly Heatmap')]")
	WebElement monthlyheatmap;
	@FindBy(xpath = "//div[contains(@class,'_chartContainer_')]")
	WebElement dropcontainer5;
	@FindBy(xpath = "//div[contains(text(),'Error: No data available please change the dates!!')]")
	WebElement datevalidationmessage;
	@FindBy(xpath = "//span[text()='Chat']/parent::h6//parent::div")
	WebElement chat;
	@FindBy(xpath = "//input[@placeholder='Search People...']")
	WebElement searchbox;
	@FindBy(xpath = "(//div[contains(@class,'_person')])[1]")
	WebElement username;
	@FindBy(xpath = "//textarea[@ name='message']")
	WebElement message;
	@FindBy(xpath = "//div[@ class='_sendButton_1trqr_97']")
	WebElement send;
	@FindBy(xpath = "//div[text()='Share']")
	WebElement share;
	@FindBy(xpath = "//h6[text()='Download']")
	WebElement download;
	@FindBy(xpath = "//span[@class=\"ant-modal-close-x\"]")
	WebElement cancel;
	@FindBy(xpath = "//div[text()='Logout']/parent::button")
	WebElement logout;
	@FindBy(xpath = "//div[@class='_people_1trqr_1']//p[contains(text(),'test new')]")
	WebElement testnew;
	@FindBy(xpath = "//div[@class='_chatOther_r1biz_1']//p[text()='hi']")
	WebElement reciverMsg;
	@FindBy(xpath="//div[contains(@class,'_playButton')]")
	WebElement playBtn;
	@FindBy(tagName ="table")
	WebElement table;
	@FindBy(xpath="//div[@class='Toastify']")
	WebElement toast;
	
	public WebElement assetAllocatioWebElement() {
		return assetAllocation;
	}
	public WebElement playBtnWebElement() {
		return playBtn;
	}
	public WebElement tableWebElement() {
		return table;
	}
	public void dragReport(String reportName) throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement report = driver.findElement(By.xpath("//div[text()='"+reportName+"']/parent::div"));
		actions.dragAndDrop(report, dropcontainer).perform();
		Thread.sleep(5000);
	}
	
	public void dragAssetAllocation() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(assetAllocation, dropcontainer).perform();
		Thread.sleep(5000);
	}

	public void dragAssetPerformance() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(assetperformance, dropcontainer1).perform();
		Thread.sleep(10000);
	}

	public void dragDrawdown() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drawdown, dropcontainer2).perform();
		Thread.sleep(10000);
	}

	public void PortFolioGrowth() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(portfoliogrowth, dropcontainer3).perform();
		Thread.sleep(10000);
	}

	public void MonthlyPnlHeatmap() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(monthlypnlheatmap, dropcontainer4).perform();
		Thread.sleep(10000);
	}

	public void MonthlyHeatmap() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(monthlyheatmap, dropcontainer5).perform();
		Thread.sleep(10000);

	}

	public void SendMessage(String msg) throws InterruptedException {
		chat.click();
		searchbox.sendKeys("receiver");
		Thread.sleep(1000);
		username.click();
		message.sendKeys(msg);
		Thread.sleep(1000);
		send.click();
		Thread.sleep(500);
		Actions act=new Actions(driver);
		act.click(chat).perform();
		Thread.sleep(500);
		act.click(chat).perform();
	}
	
	public WebElement ReceiveMessage(String msg) throws InterruptedException {
		chat.click();
		searchbox.sendKeys("sender");
		Thread.sleep(1000);
		username.click();
		Thread.sleep(1000);
		message=driver.findElement(By.xpath("//p[text()='"+msg+"']/parent::div"));
		return message;
	}

	public void Share() throws InterruptedException {
		share.click();
		Thread.sleep(10000);
		download.click();
		cancel.click();
	}

	public Homepage clickLogoutBtn() throws InterruptedException {
		Thread.sleep(200);
		logout.click();
		Homepage home=new Homepage(driver);
		return home;
	}

	public String DateSelectionValidation() throws InterruptedException {
		Thread.sleep(3000);
		return datevalidationmessage.getText();
	}

	public String ChatReciver() throws InterruptedException {
		chat.click();
		testnew.click();
		Thread.sleep(2000);
		System.out.println(reciverMsg.getText());
		return reciverMsg.getText();
	}
}
