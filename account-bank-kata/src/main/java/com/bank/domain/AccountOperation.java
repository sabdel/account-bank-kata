package com.bank.domain;

import java.time.LocalDate;

import java.util.UUID;

public  class AccountOperation extends BusinessObject {

	
	private LocalDate date;
	
	private double amount;
	
	private double balance;
	
    private OperationType operationType; 
	

    public AccountOperation() {
		super();
		this.date = LocalDate.now();
	}
	public AccountOperation(double amount, double balance, OperationType operationType) {
		super();
		this.date = LocalDate.now();
		this.amount = amount;
		this.balance = balance;
	}

	
	public OperationType getOperationType() {
		return operationType;
	}
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public UUID getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountOperation other = (AccountOperation) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
