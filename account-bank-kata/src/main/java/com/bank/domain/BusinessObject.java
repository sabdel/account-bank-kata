package com.bank.domain;

import java.io.Serializable;
import java.util.UUID;

public abstract class  BusinessObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected final UUID id;

	public BusinessObject() {
		super();
		this.id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}
	
	

}
