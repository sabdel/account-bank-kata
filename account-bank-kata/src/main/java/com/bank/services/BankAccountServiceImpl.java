package com.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.BankAccountDAO;
import com.bank.domain.BankAccount;
import com.bank.domain.BankAccountBuilder;
import com.bank.domain.Client;

@Service
public class BankAccountServiceImpl implements BankAccountService {
	
	@Autowired ClientService clientService;
	
	@Autowired BankAccountDAO  bankAccountDAO;

	@Override
	public BankAccount createAccount(Client client) {
		BankAccount account =new BankAccountBuilder().createBuilder().owner(client).balance(20.0).build();
		return bankAccountDAO.save(account);
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
