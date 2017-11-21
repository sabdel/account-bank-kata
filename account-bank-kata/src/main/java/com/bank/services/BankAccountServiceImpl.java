package com.bank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.domain.BankAccount;
import com.bank.domain.Client;

@Service
public class BankAccountServiceImpl implements BankAccountService {
	
	@Autowired ClientService clientService;

	@Override
	public BankAccount createAccount(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteAccount(BankAccount client) {
		// TODO Auto-generated method stub
		return null;
	}

}
