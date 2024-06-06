package Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class appStepDefination 
{
	@Given("open the login page")
	public void open_the_login_page() {
	   System.out.println("Open the page");
	}

	@When("Enter the Username")
	public void enter_the_username() {
	   System.out.println("Username entered");
	}

	@When("Enter the Password")
	public void enter_the_password() {
	    System.out.println("password Entered");
	}

	@When("Click on the Log in Button")
	public void click_on_the_log_in_button() {
	  System.out.println("Cliecked button");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	   System.out.println("page displayed");
	}

}
