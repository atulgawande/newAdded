package Home;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Driver.config.driverFactory;
import Page.Home_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home_pageSteps 
{
	
	Home_page hm=new Home_page(driverFactory.getDriver());
	@Given("user should be on landing page")
	public void user_should_be_on_landing_page() {
		WebDriver driver=driverFactory.getDriver();
		driver.get("https://www.amazon.in/");
	   
	}

	@Then("page should be contain {string}")
	public void page_should_be_contain(String word) {
		 String title = hm.getTitleOfPage();
		 boolean idWordPresent = title.contains(word);
		 Assert.assertTrue(idWordPresent);
		 
		 
	

	}

	@Then("cart icon should be displayed")
	public void cart_icon_should_be_displayed() {
		boolean isDis = hm.cartIconDisplayed();
		Assert.assertTrue(isDis);
	   
	}

	@When("user clicks on fashion links")
	public void user_clicks_on_fashion_links() {
		hm.disPhoto();
	
	}

	@Then("page should be nevigate to the Home page")
	public void page_should_be_nevigate_to_the_Home_page() {
	 boolean dis = hm.tideIsDisplayed();
	 Assert.assertTrue(dis);
	}
	

	

	@When("user enter the username {string}")
	public void user_enter_the_username(String uname) {
		hm.SignHourOnPgae(uname);
	 
	}

	@And("user enter the password {string}")
	public void user_enter_the_password(String pwd) {
		hm.EnterPassword(pwd);
	    
	}




}
