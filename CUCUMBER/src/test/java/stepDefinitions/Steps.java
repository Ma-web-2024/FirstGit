package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	@Given("user is on log page")
	public void user_is_on_log_page() {
		System.out.println("Inside Steps - user is on log page ");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	System.out.println("Inside Steps - user enters username and password ");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside Steps - clicks on login button ");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Steps - user is navigated to the home page ");
	}



}