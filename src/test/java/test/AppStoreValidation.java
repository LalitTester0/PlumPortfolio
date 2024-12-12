package test;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.AppStore;
import pageobject.DashBoard;
import testcomponent.BaseTest;

public class AppStoreValidation extends BaseTest {
	
	@Test
	public void Plumvision() throws IOException, InterruptedException {
		
		page.goTo();
		page.loginData();
		DashBoard dd=new DashBoard(driver);
		dd.DashBoard();
		AppStore pp=new AppStore(driver);
		pp.PlumVision();
		
		
		
	}
	
	
	
	
	

}
