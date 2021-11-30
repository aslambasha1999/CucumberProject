package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user is on Login page")
	public void user_is_on_login_page() {
	    System.out.println("User is on Login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    System.out.println("User entered valid login Credentials");
	}

	@And("Clicks Login button")
	public void clicks_login_button() {
	    System.out.println("User Clicked Login Button");
		
	}

	@Then("User navigates to Homepage")
	public void user_navigates_to_homepage() {
		System.out.println("User navigated to HomePage");
	    
	}

}
