package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksExampleDefination {

	@Before
	public void setup() {
		System.out.println("Pre-condition");
	}
	
	@After
	public void tearDown() {
		System.out.println("Post-condition");
	}
	
	@Given("^given step one$")
	public void given_step_one() {
	    System.out.println("Scenario-1 TestM-1");
	}

	@When("^when step one$")
	public void when_step_one() {
		System.out.println("Scenario-1 TestM-2");
	}

	@Then("^then step one$")
	public void then_step_one() {
		System.out.println("Scenario-1 TestM-3");
	}

	
	
	
	

	@Given("^given step two$")
	public void given_step_two() {
		System.out.println("Scenario-2 TestM-4");
	}

	@When("^when step two$")
	public void when_step_two() {
		System.out.println("Scenario-2 TestM-5");
	}

	@Then("^then step two$")
	public void then_step_two() {
		System.out.println("Scenario-2 TestM-6");
	}




	@Given("^given step three$")
	public void given_step_three() {
		System.out.println("Scenario-3 TestM-7");
	}

	@When("^when step three$")
	public void when_step_three() {
		System.out.println("Scenario-3 TestM-8");
	}

	@Then("^then step three$")
	public void then_step_three() {
		System.out.println("Scenario-3 TestM-9");
	}

}

