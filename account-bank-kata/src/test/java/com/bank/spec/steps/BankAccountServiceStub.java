package com.bank.spec.steps;

import com.bank.domain.BankAccount;
import com.bank.domain.BankAccountBuilder;
import com.bank.domain.Client;
import com.bank.services.BankAccountService;

public class BankAccountServiceStub  implements BankAccountService{

	@Override
	public BankAccount createAccount(Client client) {
		BankAccount account =new BankAccountBuilder().createBuilder().owner(client).balance(20.0).build();
		return account;
	}

	@Override
	public Boolean deleteAccount(BankAccount client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double deposit(BankAccount account, double amount) {
        if(amount> 0){
        	account.setBalance(account.getBalance()+amount);
        }
		return account.getBalance();
	}

}
