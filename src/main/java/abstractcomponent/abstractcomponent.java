package abstractcomponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class abstractcomponent {   //parent class of page object class.
	
	WebDriver driver;
	public abstractcomponent(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
