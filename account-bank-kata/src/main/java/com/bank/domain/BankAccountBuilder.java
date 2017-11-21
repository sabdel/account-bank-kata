package com.bank.domain;

import java.util.List;

public class BankAccountBuilder {

	private BankAccount bankAccount;

	public BankAccountBuilder() {
		bankAccount = new BankAccount();
	}

	public BankAccountBuilder createBuilder() {
		return this;
	}

	public BankAccountBuilder owner(Client owner) {
		bankAccount.setOwner(owner);

		return this;
	}

	public BankAccountBuilder operations(List<AccountOperation> operations) {
		bankAccount.setOperations(operations);
		return this;
	}

	public BankAccountBuilder operation(AccountOperation record) {
		bankAccount.getOperations().add(record);
		return this;
	}

	public BankAccount build() {
		return bankAccount;
	}

}
