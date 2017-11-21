package com.bank.services;

import com.bank.domain.BankAccount;
import com.bank.domain.Client;

/**
 * This interface contains all operations which an account owner or the bank can operate on it 
 * @author SLA
 *
 */
public interface BankAccountService {

	/**
	 * Create BankAccount
	 * @param client
	 * @return
	 */
	BankAccount createAccount(Client client);
	
	/**
	 * Delete Bank Account
	 * @param client
	 * @return
	 */
	Boolean deleteAccount(BankAccount client);
}
