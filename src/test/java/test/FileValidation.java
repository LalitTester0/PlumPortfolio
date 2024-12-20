package test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.AppStore;
import pageobject.BackTestAssetAllocation;
import pageobject.DashBoard;
import pageobject.Homepage;
import pageobject.PlumVisionnew;
import testcomponent.BaseTest;

public class FileValidation extends BaseTest {

	// as a user I should able to generate to asset allocation report
	@Test
	public void assetAllocationReport() throws IOException, InterruptedException, AWTException {
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		BackTestAssetAllocation back = plum.navigatetoBackTestAssetAllocation();
		back.dragReport("Asset Allocation");
		WebElement playButton = back.playBtnWebElement();
		Assert.assertTrue(playButton.isDisplayed(), "play button is not  displayed");
	}

	// as a user I should able to generate to asset perfomance report
	@Test
	public void assetPerformanceReport() throws IOException, InterruptedException, AWTException {
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		BackTestAssetAllocation back = plum.navigatetoBackTestAssetAllocation();
		back.dragReport("Asset Performance");
		WebElement playButton = back.playBtnWebElement();
		Assert.assertTrue(playButton.isDisplayed(), "play button is not  displayed");
	}

	// as a user I should able to generate to asset perfomance report
	@Test
	public void portflioGrowthReport() throws IOException, InterruptedException, AWTException {
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		BackTestAssetAllocation back = plum.navigatetoBackTestAssetAllocation();
		back.dragReport("Portfolio Growth");
		WebElement playButton = back.playBtnWebElement();
		Assert.assertTrue(playButton.isDisplayed(), "play button is not  displayed");
	}

	// as a user I should able to generate to asset perfomance report
	@Test
	public void MonthlyPnlHeatmapReport() throws IOException, InterruptedException, AWTException {
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		BackTestAssetAllocation back = plum.navigatetoBackTestAssetAllocation();
		back.dragReport("Monthly Pnl Heatmap");
		WebElement playButton = back.playBtnWebElement();
		Assert.assertTrue(playButton.isDisplayed(), "play button is not  displayed");
	}

	@Test
	public void MonthlyHeatmapReport() throws IOException, InterruptedException, AWTException {
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		BackTestAssetAllocation back = plum.navigatetoBackTestAssetAllocation();
		back.dragReport("Monthly Heatmap");
		WebElement playButton = back.playBtnWebElement();
		Assert.assertTrue(playButton.isDisplayed(), "play button is not  displayed");
	}

	@Test
	public void DrawdownReport() throws IOException, InterruptedException, AWTException {
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		BackTestAssetAllocation back = plum.navigatetoBackTestAssetAllocation();
		back.dragReport("Drawdown");
		WebElement table = back.tableWebElement();
		Assert.assertTrue(table.isDisplayed(), "table is not  displayed");
	}

	// verify that if data is not present on selected dates then alert message
	// should get displayed
	@Test
	public void captureNoDataMessage() throws IOException, InterruptedException, AWTException {
		String expectedtext = "Error: No data available please change the dates!!!";
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		BackTestAssetAllocation back = plum.navigatetoBackTestAssetAllocation2();
		back.dragReport("Asset Allocation");
		String actualtext = back.DateSelectionValidation();
		Assert.assertEquals(actualtext, expectedtext);
	}

	@Test
	public void portfoliologout() throws AWTException, InterruptedException, IOException {
		String expectedText = "logout successful";
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		BackTestAssetAllocation back = plum.navigatetoBackTestAssetAllocation2();
		Homepage home = back.clickLogoutBtn();
		String actualText = home.toastmessage();
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test
	public void portfoliodisplaynew() throws IOException, AWTException, InterruptedException {
		String msg="123456";
		page.goTo();
		DashBoard dash = page.enterSenderLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		BackTestAssetAllocation back = plum.navigatetoBackTestAssetAllocation2();
		back.SendMessage(msg);
		Homepage home = back.clickLogoutBtn();
		home.navigatetoLogin();
		page.enterReceiverLoginData();
		dash.clickOnAppstoreBtn();
		app.clickonPlumVisionBtn();
		plum.navigatetoBackTestAssetAllocation2();
		WebElement mess = back.ReceiveMessage(msg);
		Assert.assertTrue(mess.isDisplayed(), "message is not received");
		
	}

	

	
	

}
