package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponent.abstractcomponent;

public class BackTestAssetAllocation extends abstractcomponent {
	
	public WebDriver driver;
	public BackTestAssetAllocation (WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);//PREDEFINE CLASS APPLICABLE FOR ALL ELEMENT
	}
	
	
	@FindBy(xpath="//div[text()='Asset Allocation']")
	WebElement source1;
	@FindBy(xpath="//div[@class='_dropChartContainer_pl9cj_11']")
	WebElement destination1;
	
	@FindBy(xpath="//div[contains(text(),'Asset Performance')]/parent::div")
	WebElement source2;
	@FindBy(xpath="//div[contains(@class,'_chartContainer_')]")
	WebElement destination2;
	
	@FindBy(xpath="//div[contains(text(),'Drawdown')]")
	WebElement source3;
	@FindBy(xpath="//div[contains(@class,'_chartContainer_')]")
	WebElement destination3;
	
	
	@FindBy(xpath="//div[contains(text(),'Portfolio Growth')]")
	WebElement source4;
	@FindBy(xpath="//div[text()='Drop a chart type to display it here.']")
	WebElement destination4;
	
	@FindBy(xpath="//div[contains(text(),'Monthly Pnl Heatmap')]")
	WebElement source5;
	@FindBy(xpath="//div[contains(@class,'_chartContainer_')]")
	WebElement destination5;
	
	@FindBy(xpath="//div[contains(text(),'Monthly Heatmap')]")
	WebElement source6;
	@FindBy(xpath="//div[contains(@class,'_chartContainer_')]")
	WebElement destination6;
	
	//chat module webelement
	
	@FindBy(xpath="//span[text()='Chat']/parent::h6//parent::div")
	WebElement chat;
	
	@FindBy(xpath="//p[text()='varun patil']")
	WebElement username;
	
	@FindBy(xpath="//textarea[@ name='message']")
	WebElement message;
	
	@FindBy(xpath="//div[@ class='_sendButton_1trqr_97']")
	WebElement send;
	@FindBy(xpath="//div[text()='Share']")
	WebElement share;
	
	@FindBy(xpath="//h6[text()='Download']")
	WebElement download;
	
	@FindBy(xpath="//span[@class=\"ant-modal-close-x\"]")
	WebElement cancel;
	
	@FindBy(xpath="//div[text()='Logout']")
	WebElement logout;
	
	
	
	
	public void AssetAllocation() throws InterruptedException
	{
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source1, destination1).perform();
		Thread.sleep(10000);
	}
	
	public void AssetPerformance() throws InterruptedException {
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source2, destination2).perform();
		Thread.sleep(10000);
	}
	
	public void Drawdown() throws InterruptedException {
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source3, destination3).perform();
		Thread.sleep(10000);
	}
	
	public void PortFolioGrowth() throws InterruptedException {
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source4, destination4).perform();
		Thread.sleep(10000);
	}
	
	public void MonthlyPnlHeatmap() throws InterruptedException {
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source5, destination5).perform();
		Thread.sleep(10000);
	}
	
	public void MonthlyHeatmap() throws InterruptedException {
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source6, destination6).perform();
		Thread.sleep(10000);
		
	}
		
		public void ChatSend() throws InterruptedException {
			
			chat.click();
			Thread.sleep(5000);
			username.click();
			
			message.sendKeys("hi");
			Thread.sleep(5000);
			send.click();
			Thread.sleep(5000);
		}
		
	public void Share() throws InterruptedException {
		
		share.click();
		Thread.sleep(10000);
		download.click();
		cancel.click();
	}
	
	public void Logout() throws InterruptedException {
		
		logout.click();
		Thread.sleep(10000);
	}

}
