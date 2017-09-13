package com.libertymutual.goforcode.invoicify.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.libertymutual.goforcode.invoicify.models.User;
import com.libertymutual.goforcode.invoicify.repositories.UserRepository;

@Configuration
@Profile("development")

public class SeedData {

	public SeedData(UserRepository usersRepository) {
		usersRepository.save(new User("jean", "password", "USER"));
		usersRepository.save(new User("admin", "admin", "ADMIN"));
		usersRepository.save(new User("clerk", "clerk", "CLERK"));
		usersRepository.save(new User("accountant", "accountant", "ACCOUNTANT"));
	}
	
}
