package test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.AppStore;
import pageobject.BackTestAssetAllocation;
import pageobject.DashBoard;
import pageobject.PlumVisionnew;
import testcomponent.BaseTest;

public class FileUploadValidation extends BaseTest {
	
	//as a user i should able to upload valid excel file
	@Test
	public void uploadValidFile() throws IOException, InterruptedException, AWTException {
		String expectedText="File uploaded sucessfully.";
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		plum.uploadCsvFile();
		String actualtext = plum.getSuccessfullUploadtext();
		Assert.assertEquals(actualtext,expectedText);
	}
	
	//as a user i should able to set parameter to generate report
	@Test
	public void setvalidParameter() throws IOException, InterruptedException, AWTException {
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		BackTestAssetAllocation back = plum.navigatetoBackTestAssetAllocation();
		WebElement assetAllocation = back.assetAllocatioWebElement();
		Assert.assertTrue(assetAllocation.isDisplayed(), "Asset Allocation is not present");	
	}
	
	@Test
	public void wrongfileupload() throws IOException, InterruptedException, AWTException {
		String expectedtext = "An error occurred while uploading the file. Please try again.";
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		String actualtext = plum.Wrongfileupload();
		Assert.assertEquals(actualtext, expectedtext);
	}

}
