package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import testcomponent.BaseTest;

public class LoginValidation extends BaseTest {
	
	@Test
	public void Login() throws IOException, InterruptedException {
		
		page.goTo();
		page.loginData();
		//Thread.sleep(10000);
	}
	@Test
	public void LoginInvalidcrd() throws IOException, InterruptedException
	{
		String expectedtext="Invalid email or password";
		page.goTo();
String actualtext=		page.invalidloginData();
		
		Assert.assertEquals(actualtext, expectedtext);
	
		
	}
		
	
	
	
	

}
