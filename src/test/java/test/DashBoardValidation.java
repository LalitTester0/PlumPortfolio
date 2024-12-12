package test;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.DashBoard;
import testcomponent.BaseTest;

public class DashBoardValidation  extends BaseTest{
	
	@Test
	public void Dashboard() throws IOException, InterruptedException {
		page.goTo();
		page.loginData();
		DashBoard dd=new DashBoard(driver);
		dd.DashBoard();
		Thread.sleep(10000);
	
	
	


		
		
		
		
		


	}

}
