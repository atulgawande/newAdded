package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_page 
{
WebDriver driver;
WebDriverWait wait;


@FindBy(xpath="//*[@id=\"nav-cart\"]") WebElement cartIcon;
	
	
	@FindBy(xpath="//*[@id=\"CardInstanceysPFOQJwuRgZ__wei6B_QQ\"]/a/img") WebElement photo;
	@FindBy(xpath="//*[@id=\"sobe_d_b_5_1\"]/a/div/img") WebElement Tide;
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]") WebElement SignHour;
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a") WebElement SignInButton;
	@FindBy(xpath="//*[@id=\"ap_email\"]") WebElement user;
	@FindBy(xpath="(//*[@id=\"continue\"])[2]") WebElement ContinueButton;
	@FindBy(xpath="//*[@id=\"ap_password\"]") WebElement PasswordFeild;
	@FindBy(xpath="//*[@id=\"signInSubmit\"]") WebElement Submit;
	public Home_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	public String getTitleOfPage()
	{
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
	}
	
	public boolean cartIconDisplayed()
	{
		boolean result = cartIcon.isDisplayed();
		return result;
	}
	
	public void disPhoto()
	{
		wait.until(ExpectedConditions.visibilityOf(photo));
		photo.click();
	}
	
	public boolean tideIsDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(Tide));
		boolean TideDis = Tide.isDisplayed();
		return TideDis;
		
	}
	public void SignHourOnPgae(String uname)
	{
	Actions act=new Actions(driver);
	act.moveToElement(SignHour).perform();
	
	SignInButton.click();
	user.sendKeys(uname);
	ContinueButton.click();
	
	
	
	
	}
	public void EnterPassword(String pwd)
	{
		PasswordFeild.sendKeys(pwd);
		Submit.click();
	}
}
