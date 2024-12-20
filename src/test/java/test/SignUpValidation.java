package test;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testcomponent.BaseTest;

public class SignUpValidation extends BaseTest {

	// as a new user,I should able to create new account
	@Test
	public void SignUp() throws IOException, InterruptedException {
		page.goTo();
		pageobject.SignUp Sign = page.navigateToSignUp();
		Sign.SignUpData();
		WebElement email = page.emailidWeblelemnent();
		Assert.assertTrue(email.isDisplayed(), "email is not displayed");
	}

	// verify that user should not able to signup using same mail id
	@Test
	public void capturetoastmessagesignup() throws IOException, InterruptedException {
		String expectedtext = "An error occurred while creating the account. Please try again later.";
		page.goTo();
		pageobject.SignUp Sign = page.navigateToSignUp();
		String actualtext = Sign.duplicateMailidvalidation();
		Assert.assertEquals(actualtext, expectedtext);
	}

}
