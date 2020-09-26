package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;






public class StepDefinitions {


@Given("landingpage")
public void landingpage() {
	System.out.println("holla");
	System.out.println("holla");
	System.out.println("holla");
}

@When("login")
public void login() {
	System.out.println("hello");
	System.out.println("holla");
}

@Then("homepage")
public void homepage() {
	System.out.println("hi");
}

	}
