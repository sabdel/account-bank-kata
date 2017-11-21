package com.bank.domain;


import java.util.Set;

public class Owner  extends BusinessObject{

	private Client client;
	
	private Set<OperationType> authorizedOperations;

	public Owner(Client client, Set<OperationType> authorizedOperations) {
		super();
		this.client = client;
		this.authorizedOperations = authorizedOperations;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<OperationType> getAuthorizedOperations() {
		return authorizedOperations;
	}

	public void setAuthorizedOperations(Set<OperationType> authorizedOperations) {
		this.authorizedOperations = authorizedOperations;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
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
		Owner other = (Owner) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		return true;
	}
	
	
	
}
