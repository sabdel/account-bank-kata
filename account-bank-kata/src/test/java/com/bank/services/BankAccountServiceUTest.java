package com.bank.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.bank.dao.BankAccountDAO;
import com.bank.domain.BankAccount;
import com.bank.domain.BankAccountBuilder;
import com.bank.domain.Client;

@RunWith(MockitoJUnitRunner.class)
public class BankAccountServiceUTest {

	@Mock
	private BankAccountDAO accountDAO;

	@Mock
	private Client client;

	@InjectMocks
	private BankAccountServiceImpl BankAccountService = new BankAccountServiceImpl();

	BankAccount mydAccount;

	@Before
	public void setUp() {
		 mydAccount = new BankAccountBuilder().createBuilder().owner(client).build();
	}

	@Test
	public void createNewAccount() {

		// Mockito expectations
		when(accountDAO.save(any(BankAccount.class))).thenReturn(mydAccount);

		// Execute the method being tested
		BankAccount newAccount = BankAccountService.createAccount(client);

		// Validation
		assertNotNull(newAccount);
		assertEquals(newAccount, mydAccount);
	}

	@Test
	public void depositTest() {

		Double amount1 = Double.valueOf(3000);
		Double amount2 = Double.valueOf(1000);

		mydAccount.setBalance(Double.valueOf(1500));

		System.out.println(new Date() + " AVAILABLE ACCOUNT BALANCE : " + mydAccount.getBalance() + " \n ");

		System.out.println("Operation : Deposit \n");

		BankAccountService.deposit(mydAccount, amount1);
		System.out.println(
				(assertThat(mydAccount.getBalance()).isPositive()) != null ? new Date() + " CREDIT : " + amount1 : "");

		BankAccountService.deposit(mydAccount, amount2);
		System.out.println(
				(assertThat(mydAccount.getBalance()).isPositive()) != null ? new Date() + " CREDIT : " + amount2 : "");

		System.out.println((assertThat(mydAccount.getBalance()).isPositive()) != null
				? new Date() + " REMAINING ACCOUNT BALANCE : " + mydAccount.getBalance() + " \n " : "" + "\n");
	}

}
