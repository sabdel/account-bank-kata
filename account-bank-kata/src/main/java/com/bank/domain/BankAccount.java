package com.bank.domain;

import java.util.ArrayList;
import java.util.List;

import java.util.UUID;

/**
 * This class represents the Account .
 * @author SLA
 *
 */
public class BankAccount extends BusinessObject {

//	/**
//	 * It's the identifer of the Account --UUID , Hilo-Hibernate ?
//	 */
//	private final UUID id;
	
//	/**
//	 * The owners of the Account (...)
//	 */
//	private Set<Owner> ouwners;
	
	private Client owner;
	
	/**
	 *
	 */
	private double balance; 
	
	/**
	 * The list of all operations ....
	 */
	private List<AccountOperation> operations;

	
	public BankAccount() {
		super();
		this.balance = 20;
	}

	public BankAccount(Client owner) {
		super();
		this.balance = 20;
		this.owner = owner;
		this.operations = new ArrayList<>();
	}

	

	
	public Client getOwner() {
		return owner;
	}


	public void setOwner(Client owner) {
		this.owner = owner;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public List<AccountOperation> getOperations() {
		return operations;
	}


	public void setOperations(List<AccountOperation> operations) {
		this.operations = operations;
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
		BankAccount other = (BankAccount) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
}
