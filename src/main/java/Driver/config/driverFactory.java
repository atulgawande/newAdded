package Driver.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class driverFactory {
	
	static WebDriver driver;
	public WebDriver initBrowser(String browsername )
	
	{
		if(browsername.equals("Chrome"))
		{
			 driver =new ChromeDriver();
		}
		else if (browsername.equals("firefox")) {
			 driver=new FirefoxDriver();
			
		}
		return driver;
	}
	public static WebDriver getDriver()
	{
		return driver;
		
	}

}
