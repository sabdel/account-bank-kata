package com.bank.domain;

import java.time.LocalDate;

public class AccountOperationBuilder {

	 private AccountOperation accountOperation;

	  public AccountOperationBuilder()
	  {
	    accountOperation = new AccountOperation();
	  }

	  public AccountOperationBuilder createBuilder()
	  {
	    return this;
	  }

	  
	  public AccountOperationBuilder amount(double amount)
	  {
	    accountOperation.setAmount(amount);
	    return this;
	  }

	  public AccountOperationBuilder accountType(OperationType operationType)
	  {
	    accountOperation.setOperationType(operationType);
	    return this;
	  }

	  public AccountOperationBuilder date(LocalDate date)
	  {
	    accountOperation.setDate(date);
	    return this;
	  }

	  public AccountOperation build()
	  {
	    return accountOperation;
	  }
}
