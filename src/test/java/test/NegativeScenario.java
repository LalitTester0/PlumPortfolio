package test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.AppStore;
import pageobject.BackTestAssetAllocation;
import pageobject.DashBoard;
import pageobject.PlumVisionnew;
import testcomponent.BaseTest;

public class NegativeScenario extends BaseTest{
	@Test
	public void capturetoastmessagesignup() throws IOException, InterruptedException {
		String expectedtext="An error occurred while creating the account. Please try again later.";
		page.goTo();
		pageobject.SignUp Sign = page.navigateToSignUp();
	String actualtext	=Sign.Mailidvalidation();
	Assert.assertEquals(actualtext, expectedtext);
		
	}
	@Test
	public void signupsamedata() throws IOException, InterruptedException {
		
		String expectedtext="An error occurred while creating the account. Please try again later.";
		page.goTo();
		pageobject.SignUp Sign = page.navigateToSignUp();
	String actualtext	=Sign.Samedatavalidation();
	Assert.assertEquals(actualtext, expectedtext);
		
		
		
		
	}
	
	
	

	@Test
	public void capturenodatamessage() throws IOException, InterruptedException, AWTException {
		String expectedtext="Error: No data available please change the dates!!";
		page.goTo();
		DashBoard dd = page.loginData();
			
	  AppStore pp = dd.DashBoard();
			
			pp.PlumVision();
			PlumVisionnew ff=new PlumVisionnew(driver);
			
			ff.CsvFileupload();
			ff.NodataStartdate();
			BackTestAssetAllocation  drag1=new BackTestAssetAllocation(driver);
			
			drag1.AssetAllocation();
			
	String actualtext		=drag1.DateSelectionValidation();
			Assert.assertEquals(actualtext, expectedtext);
		
	}
	
	@Test
	public void wrongfileupload() throws IOException, InterruptedException, AWTException {
		String expectedtext="An error occurred while uploading the file. Please try again.";
		page.goTo();
		DashBoard dd = page.loginData();
			
	  AppStore pp = dd.DashBoard();
			
			pp.PlumVision();
			PlumVisionnew ff=new PlumVisionnew(driver);
String actualtext=			ff.Wrongfileupload();
Assert.assertEquals(actualtext, expectedtext);
		
	}
	
	@Test
	
	public void recivermessage() throws IOException, InterruptedException, AWTException {
		String expectedmessage="hi";
		
		page.NewUserlogin();
	
		
		DashBoard dd = new DashBoard(driver);
			
	  AppStore pp = dd.DashBoard();
			
			pp.PlumVision();
			PlumVisionnew vision=new PlumVisionnew(driver);
			
			vision.CsvFileupload();
			vision.Startdate();
			BackTestAssetAllocation message=new BackTestAssetAllocation(driver);
String actualmessage=	message.ChatReciver();
Assert.assertEquals(actualmessage,expectedmessage );
			
	}
	@Test
	public void appstoreclick() throws IOException, InterruptedException {
		
		page.goTo();
		page.loginData();
		DashBoard dd=new DashBoard(driver);
		dd.DashBoard();
	
		Thread.sleep(2000);
		dd.Sixmoduledisplay();
	
	}
	
}




