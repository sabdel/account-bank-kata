package com.bank.services;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.bank.dao.BankAccountDAO;
import com.bank.domain.BankAccount;
import com.bank.domain.BankAccountBuilder;
import com.bank.domain.Client;


@RunWith(MockitoJUnitRunner.class)
 public class BankAccountServiceUTest {
	
	@Mock
    private BankAccountDAO accountDAO;
 
	@Mock
    private Client client;

	@InjectMocks
    private BankAccountServiceImpl accountService = new BankAccountServiceImpl();
	
    
    @Test
    public void createNewAccount() {
 
        BankAccount persistedAccount  = new BankAccountBuilder().createBuilder().owner(client).build();

        // Mockito expectations                            
        when(accountDAO.save(any(BankAccount.class))).thenReturn(persistedAccount);
    
        // Execute the method being tested     
        BankAccount newAccount = accountService.createAccount(client);
 
        // Validation  
        assertNotNull(newAccount);
        assertEquals(newAccount, persistedAccount);
    }
}
