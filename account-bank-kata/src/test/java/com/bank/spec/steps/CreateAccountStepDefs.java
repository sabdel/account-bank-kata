package com.bank.spec.steps;

import static org.junit.Assert.assertEquals;

import com.bank.domain.BankAccount;
import com.bank.domain.BankAccountBuilder;
import com.bank.domain.Client;
import com.bank.services.BankAccountService;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountStepDefs {

	private Client client;
	
	private BankAccount bankAccount;
	
	private BankAccountService  bankAccountServiceStub ;

	
	
	@Before
	public void setUp(){
		bankAccountServiceStub = new BankAccountServiceStub();
	}
	
	
	@Given("^an existing client named \"([^\"]*)\"$")
	public void an_existing_client_named(String firstName) throws Throwable {
        client = new Client(firstName);
   }

	@When("^he opens a bank account$")
	public void he_opens_a_bank_account() throws Throwable {
		bankAccount = bankAccountServiceStub.createAccount(client);
	}

	@Then("^the initial balance is (\\d+\\.\\d+) EUR$")
	public void the_initial_balance_is_EUR(double expectedBalance) throws Throwable {
		assertEquals(0, Double.compare(bankAccount.getBalance(), expectedBalance));
		
	}

}
