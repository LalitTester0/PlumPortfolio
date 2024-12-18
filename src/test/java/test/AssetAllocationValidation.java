package test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobject.AppStore;
import pageobject.BackTestAssetAllocation;
import pageobject.DashBoard;
import pageobject.PlumVisionnew;
import testcomponent.BaseTest;

public class AssetAllocationValidation extends BaseTest {
	
	
	public AssetAllocationValidation(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void portfoliodisplay() throws IOException, InterruptedException, AWTException {
		
		page.goTo();
		DashBoard dd = page.loginData();
			
	  AppStore pp = dd.DashBoard();
			
			pp.PlumVision();
			PlumVisionnew ff=new PlumVisionnew(driver);
			
			ff.CsvFileupload();
			ff.Startdate();
			BackTestAssetAllocation  drag1=new BackTestAssetAllocation(driver);
			drag1.AssetAllocation();
			drag1.AssetPerformance();
			drag1.Drawdown();
			
		
		
	}
	
	

}
