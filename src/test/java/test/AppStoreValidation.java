package test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.AppStore;
import pageobject.DashBoard;
import pageobject.PlumVisionnew;
import testcomponent.BaseTest;

public class AppStoreValidation extends BaseTest {

	// verify that after click on plum vision button it should navigate to plumvision page or not
	@Test
	public void navigateToPlumVision() throws IOException, InterruptedException {
		page.goTo();
		DashBoard dash = page.entervalidLoginData();
		AppStore app = dash.clickOnAppstoreBtn();
		PlumVisionnew plum = app.clickonPlumVisionBtn();
		WebElement csv = plum.csvWebelement();
		Assert.assertTrue(csv.isDisplayed(), "csv is not present");
	}

}
