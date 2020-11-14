package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By login=By.linkText("Login");
	
	public WebElement login()
	{
		return driver.findElement(login);
	}

}
