package test;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testcomponent.BaseTest;

public class SignUpValidation extends BaseTest {
	
	@Test
	public void SignUp() throws IOException, InterruptedException {
		
		page.goTo();
		pageobject.SignUp Sign = page.navigateToSignUp();
		
		
		Sign.SignUpData();
		
	}
		
	
		
	
		
	
	
	
	
}
	
	


