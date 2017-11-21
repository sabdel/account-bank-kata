package com.bank.services;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.bank.domain.Client;

@Service
public class ClientServiceImpl implements ClientService {

	@Override
	public Client createClient(String firstName, String lastName, Date birthday) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

}
