package test;

import java.io.IOException;

import org.testng.annotations.Test;

import testcomponent.BaseTest;

public class LoginValidation extends BaseTest {
	
	@Test
	public void Login() throws IOException, InterruptedException {
		
		page.goTo();
		page.loginData();
	}

}
