package com.bank.spec.steps;

import static org.junit.Assert.assertEquals;

import com.bank.domain.BankAccount;
import com.bank.domain.BankAccountBuilder;
import com.bank.domain.Client;
import com.bank.services.BankAccountService;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DepositIntoAccountStepDefs {

	private Client client;

	private BankAccount bankAccount;

	private BankAccountService bankAccountServiceStub;

	@Before
	public void setUp() {
		bankAccountServiceStub = new BankAccountServiceStub();
	}

	
	
	@Given("^an existing client named \"([^\"]*)\" with (\\d+\\.\\d+) EUR in her account$")
	public void an_existing_client_named_with_EUR_in_her_account(String firstName, double balance) throws Throwable {
		client = new Client(firstName);
		bankAccount = bankAccountServiceStub.createAccount(client);
		bankAccount.setBalance(balance);
	}

	@When("^she deposits positive amount (\\d+\\.\\d+) EUR into her account$")
	public void she_deposits_positive_amount_EUR_into_her_account(double newAmount) throws Throwable {
		bankAccountServiceStub.deposit(bankAccount, newAmount);
	}

	@Then("^the new balance will be incremented and it become(\\d+\\.\\d+) EUR$")
	public void the_new_balance_will_be_incremented_and_it_become_EUR(double expectedBalance) throws Throwable {
		assertEquals(0, Double.compare(bankAccount.getBalance(), expectedBalance));
	}

	@When("^she deposits negative amount -(\\d+\\.\\d+) EUR into her account$")
	public void she_deposits_negative_amount_EUR_into_her_account(double newAmount) throws Throwable {
		bankAccountServiceStub.deposit(bankAccount, newAmount);
	}

	@Then("^the new balance will remain and it become(\\d+\\.\\d+) EUR$")
	public void the_new_balance_will_remain_and_it_become_EUR(double expectedBalance) throws Throwable {
		assertEquals(0, Double.compare(bankAccount.getBalance(), expectedBalance));
	}

}
