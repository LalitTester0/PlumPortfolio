package test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.AppStore;
import pageobject.DashBoard;
import pageobject.PlumVisionnew;
import testcomponent.BaseTest;

public class FileUploadValidation extends BaseTest {
	@Test
	
	public void FileUpload() throws IOException, InterruptedException, AWTException {
		page.goTo();
	DashBoard dd = page.loginData();
		
  AppStore pp = dd.DashBoard();
		
		pp.PlumVision();
		PlumVisionnew ff=new PlumVisionnew(driver);
		
		ff.CsvFileupload();
		ff.Startdate();
		
		
		
	}
	
	
	
	
	

}
