package com.bank.spec.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountStepDefs {

	@Given("^an existing client named \"([^\"]*)\"$")
	public void an_existing_client_named(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^he opens a bank account$")
	public void he_opens_a_bank_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the initial balance is (\\d+)\\.(\\d+) EUR$")
	public void the_initial_balance_is_EUR(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
