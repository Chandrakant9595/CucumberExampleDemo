package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksDefination {

	//global preconditions
	@Before(order=0)
	public void setUp() {
		System.out.println("Pre-condition to all animals");
	}
	
	//global postconditions
	@After(order=0)
	public void tearDown() {
		System.out.println("Post-condition to all animals");
	}
	
	//global preconditions
	@Before(order=1)
	public void setUp1() {
		System.out.println("Pre-condition to all animals - 1");
	}
		
	//global postconditions
	@After(order=1)
	public void tearDown1() {
		System.out.println("Post-condition to all animals - 1");
	}
	
	
	@Given("^given step dog$")
	public void given_step_dog() {
	    System.out.println("Scenario-1 dog-1");
	}

	@When("^when step dog$")
	public void when_step_dog() {
		System.out.println("Scenario-1 dog-2");
	}

	@Then("^then step dog$")
	public void then_step_dog() {
		System.out.println("Scenario-1 dog-3");
	}
	
	
	//local preconditions
	@Before("@Cat")
	public void catPrecondition() {
		System.out.println("Cat precondition");
	}
	
	//local postconditions
	@After("@Cat")
	public void catPostcondition() {
		System.out.println("Cat postcondition");
	}
	
	@Given("^given step cat$")
	public void given_step_cat() {
		System.out.println("Scenario-2 cat-1");
	}

	@When("^when step cat$")
	public void when_step_cat() {
		System.out.println("Scenario-2 cat-2");
	}

	@Then("^then step cat$")
	public void then_step_cat() {
		System.out.println("Scenario-2 cat-3");
	}
	
	
	
	
	@Given("^given step monkey$")
	public void given_step_monkey() {
		System.out.println("Scenario-3 monkey-1");
	}

	@When("^when step monkey$")
	public void when_step_monkey() {
		System.out.println("Scenario-3 monkey-2");
	}

	@Then("^then step monkey$")
	public void then_step_monkey() {
		System.out.println("Scenario-3 monkey-3");
	}
}
