package test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.AppStore;
import pageobject.DashBoard;
import testcomponent.BaseTest;

public class DashBoardValidation  extends BaseTest{
	
	//verify that after click on appstore button,it should navigate to appstore page
		@Test
		public void navigateToAppstore() throws IOException, InterruptedException {
			page.goTo();
			DashBoard dash = page.entervalidLoginData();
			AppStore app = dash.clickOnAppstoreBtn();
			WebElement plum = app.plumvisionWebElement();
			Assert.assertTrue(plum.isDisplayed(), "plum vision button is not present");
		}
	
	

}
