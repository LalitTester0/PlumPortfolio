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
		String msg="123456";
		page.goTo();
		DashBoard dash = page.enterSenderLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum2 = app.clickonPlumVisionBtn();
		//BackTestAssetAllocation back = plum.navigatetoBackTestAssetAllocation2();
		BackTestAssetAllocation plum = new BackTestAssetAllocation(driver);
		plum.PortFolioGrowth();
		plum.MonthlyPnlHeatmap();
		plum.MonthlyHeatmap();
		plum.Share();
	}

	
}
