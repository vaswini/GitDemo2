package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Venky\\E20EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver_win32\\q\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser=="IE")
		{
			
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
