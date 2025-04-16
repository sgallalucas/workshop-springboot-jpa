package com.example.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.project.entities.User;
import com.example.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Lucas", "lucas@gmail.com", "111111111", "12345");
		User u2 = new User(null, "Fulano", "fulano@gmail.com", "222222222", "12345");
		
		userRepository.saveAll(Arrays.asList(u1, u2)); // saveAll() recebe como argumento uma lista de objetos
	}
	
}
