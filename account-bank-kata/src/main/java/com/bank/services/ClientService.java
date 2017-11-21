package com.bank.services;

import java.util.Date;

import com.bank.domain.Client;
/**
 * All operations on a customer ....
 * @author SLA
 *
 */
public interface ClientService {

	/**
	 * Create the client
	 * @param firstName
	 * @param lastName
	 * @param birthday
	 * @return
	 */
	Client createClient(String firstName, String lastName, Date birthday);

	/**
	 * Delete Client
	 * @param client
	 * @return
	 */
	Boolean deleteClient(Client client);

}
