package Home;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Driver.config.driverFactory;
import io.cucumber.java.Before;

public class Hooks
{
	
	WebDriver driver;
	@Before
	public void lounchBrowser() throws IOException
	{
		Properties prop=new Properties();
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
		FileInputStream file=new FileInputStream(path);
		prop.load(file);
		String browsername = prop.getProperty("browser");
				
		driverFactory df=new driverFactory();
		driver = df.initBrowser(browsername);
		driver.manage().window().maximize();
	
				
	}

	public void tearDown()
	{
		driver.quit();
	}
}
