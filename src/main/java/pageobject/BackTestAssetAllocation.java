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
	WebElement assetallocation;
	@FindBy(xpath="//div[@class='_dropChartContainer_pl9cj_11']")
	WebElement dropcontainer;
	
	@FindBy(xpath="//div[contains(text(),'Asset Performance')]/parent::div")
	WebElement assetperformance;
	@FindBy(xpath="//div[contains(@class,'_chartContainer_')]")
	WebElement dropcontainer1;
	
	@FindBy(xpath="//div[contains(text(),'Drawdown')]")
	WebElement drawdown;
	@FindBy(xpath="//div[contains(@class,'_chartContainer_')]")
	WebElement dropcontainer2;
	
	
	@FindBy(xpath="//div[contains(text(),'Portfolio Growth')]")
	WebElement portfoliogrowth;
	@FindBy(xpath="//div[text()='Drop a chart type to display it here.']")
	WebElement dropcontainer3;
	
	@FindBy(xpath="//div[contains(text(),'Monthly Pnl Heatmap')]")
	WebElement monthlypnlheatmap;
	@FindBy(xpath="//div[contains(@class,'_chartContainer_')]")
	WebElement dropcontainer4;
	
	@FindBy(xpath="//div[contains(text(),'Monthly Heatmap')]")
	WebElement monthlyheatmap;
	@FindBy(xpath="//div[contains(@class,'_chartContainer_')]")
	WebElement dropcontainer5;
	
	//date validation message WebElement
		@FindBy(xpath="//div[contains(text(),'Error: No data available please change the dates!!')]")
		//(By.xpath("//div[contains(text(),'Error: No data available please change the dates!!')]"))
		//Error: No data available please change the dates!!!
		WebElement datevalidationmessage;
	
	
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
	
	@FindBy(xpath="//div[@class='_people_1trqr_1']//p[contains(text(),'test new')]")
	WebElement testnew;
	
	@FindBy(xpath="//div[@class='_chatOther_r1biz_1']//p[text()='hi']")
	WebElement recivermsg;
	
	
	
	
	public void AssetAllocation() throws InterruptedException
	{
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(assetallocation, dropcontainer).perform();
		Thread.sleep(10000);
		
		
	}
	
	public void AssetPerformance() throws InterruptedException {
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(assetperformance, dropcontainer1).perform();
		Thread.sleep(10000);
	}
	
	public void Drawdown() throws InterruptedException {
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drawdown, dropcontainer2).perform();
		Thread.sleep(10000);
	}
	
	public void PortFolioGrowth() throws InterruptedException {
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(portfoliogrowth, dropcontainer3).perform();
		Thread.sleep(10000);
	}
	
	public void MonthlyPnlHeatmap() throws InterruptedException {
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(monthlypnlheatmap,dropcontainer4 ).perform();
		Thread.sleep(10000);
	}
	
	public void MonthlyHeatmap() throws InterruptedException {
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(monthlyheatmap, dropcontainer5).perform();
		Thread.sleep(10000);
		
	}
		
		public void ChatSend() throws InterruptedException {
			
			chat.click();
			
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
	
	public String DateSelectionValidation() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println(datevalidationmessage.getText());
		return datevalidationmessage.getText();
	}
    
	public String ChatReciver() throws InterruptedException {
		
		chat.click();
		testnew.click();
		Thread.sleep(2000);
		System.out.println(recivermsg.getText());
		return recivermsg.getText();
	}
}
