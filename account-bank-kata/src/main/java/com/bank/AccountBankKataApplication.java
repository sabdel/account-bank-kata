package com.bank;

import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.bank.services.ClientService;

@SpringBootApplication
public class AccountBankKataApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountBankKataApplication.class, args);
	}
	
	@Profile("test")
	@Configuration
	public class NameServiceTestConfiguration {
	    @Bean
	    @Primary
	    public ClientService nameService() {
	        return Mockito.mock(ClientService.class);
	    }
	}
}
