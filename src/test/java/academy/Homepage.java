package academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class Homepage extends base{
	@Test
	public void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage l=new LandingPage(driver);
		l.login().click();
		
		LoginPage login=new LoginPage(driver);
		login.Username().sendKeys("hi");
		login.Password().sendKeys("123");
		login.Submit().click();
		System.out.println("venkat");
		System.out.println("hello");
	}

}
