package com.bank.services;

import java.util.Set;

import com.bank.domain.Client;
import com.bank.domain.OperationType;
import com.bank.domain.Owner;

public interface BankAccountOwnerService {

	  Owner createBankAccountOwner(Client client);
	  
	  Owner createBankAccountOwner(Client client, Set<OperationType> availbaleOperations);
	  
	  Owner deleteBankAccountOwner(Owner owner);
	
}
