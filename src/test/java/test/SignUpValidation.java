package test;

import java.io.IOException;

import org.testng.annotations.Test;

import testcomponent.BaseTest;

public class SignUpValidation extends BaseTest {
	
	@Test
	public void SignUp() throws IOException, InterruptedException {
		
		page.goTo();
		pageobject.SignUp sign = page.navigateToSignUp();
		sign.SignUpData();
	}
	
	
	
	

}
