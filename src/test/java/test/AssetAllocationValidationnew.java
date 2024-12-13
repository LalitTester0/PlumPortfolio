package test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.AppStore;
import pageobject.BackTestAssetAllocation;
import pageobject.DashBoard;
import pageobject.PlumVisionnew;
import testcomponent.BaseTest;

public class AssetAllocationValidationnew extends BaseTest {
	
	
	@Test
	public void portfoliodisplaynew() throws IOException, AWTException, InterruptedException {
		
		page.goTo();
		DashBoard dd = page.loginData();
			
	  AppStore pp = dd.DashBoard();
			
			pp.PlumVision();
			PlumVisionnew vision=new PlumVisionnew(driver);
			
			vision.CsvFileupload();
			vision.Startdate();
			BackTestAssetAllocation  plum=new BackTestAssetAllocation(driver);
			plum.PortFolioGrowth();
			plum.MonthlyPnlHeatmap();
			plum.MonthlyHeatmap();
			plum.Share();
			plum.ChatSend();
			plum.Logout();
	}
	@Test
	public void portfoliologout() throws AWTException, InterruptedException, IOException {
		
		
		page.goTo();
		DashBoard dd = page.loginData();
			
	  AppStore pp = dd.DashBoard();
			
			pp.PlumVision();
			PlumVisionnew vision=new PlumVisionnew(driver);
			
			vision.CsvFileupload();
			vision.Startdate();
			BackTestAssetAllocation  plum=new BackTestAssetAllocation(driver);
			plum.PortFolioGrowth();
			plum.MonthlyPnlHeatmap();
			plum.MonthlyHeatmap();
			plum.Logout();
			Thread.sleep(5000);
		
		
		
		
	}
	
	
	

}
