package test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.DashBoard;
import testcomponent.BaseTest;

public class LoginValidation extends BaseTest {

	//Verify that user should able to login in to system with valid user name and valid password.
	@Test
	public void logInvalidUser() throws IOException, InterruptedException {
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		WebElement appstore = dash.AppstoreWebelement();
		Assert.assertTrue(appstore.isDisplayed(), "appstore is not present");}

	//verify that user is unable to login with invalid credential
	@Test
	public void loginInvalidUser() throws IOException, InterruptedException {
		String expectedtext = "Invalid email or password";
		page.goTo();
		String actualtext = page.enterinvalidloginData();
		Assert.assertEquals(actualtext, expectedtext);
	}

}
