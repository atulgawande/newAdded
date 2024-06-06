package Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario_step 
{
	@Given("User is at signup page")
	public void user_is_at_signup_page() {
	    System.out.println("user is on sign in page");
	}

	@When("User enters name {string} in the form")
	public void user_enters_name_in_the_form(String fname) {
	   System.out.println("fname is"+ fname);
	}

	@When("User enters the age {int}")
	public void user_enters_the_age(Integer int1) {
	    System.out.println("age"+int1);
	}

	@When("User confirms the gender as {string}")
	public void user_confirms_the_gender_as(String gender) {
	    System.out.println("String is "+ gender);
	}

	@Then("User will get create")
	public void user_will_get_create() {
	    System.out.println("user created ");
	}


}
