package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.xpath("//input[@type='email']");
	By password=By.xpath("//input[@type='password']");
	By submit=By.xpath("//input[@name='commit']");
	
	
	public WebElement Username()
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	

}
