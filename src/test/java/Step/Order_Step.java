package Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order_Step
{
	@Given("User should be logged into the app")
	public void user_should_be_logged_into_the_app() {
	   System.out.println("User looged tp app");
	}

	@When("User clicks on orders link")
	public void user_clicks_on_orders_link() {
	   System.out.println("user on the Order link");
	}

	@Then("User redirects to the orders page")
	public void user_redirects_to_the_orders_page() {
	    System.out.println("user redirect to order page");
	}

	@When("User clicks on currently placed order button")
	public void user_clicks_on_currently_placed_order_button() {
	    System.out.println("currently placed order");
	}

	@Then("User should see current order information")
	public void user_should_see_current_order_information() {
	    System.out.println("Order information");
	}

	@When("User clicks on past order button")
	public void user_clicks_on_past_order_button() {
	   System.out.println("cliucked ");
	}

	@Then("User should see past order information")
	public void user_should_see_past_order_information() {
	   System.out.println("past order information");
	}

	@When("User clicks on cancelled order button")
	public void user_clicks_on_cancelled_order_button() {
	    System.out.println("cancelled order");
	}

	@Then("User should see cancelled order information")
	public void user_should_see_cancelled_order_information() {
	    System.out.println("Showing cancelled order");
	}



}
