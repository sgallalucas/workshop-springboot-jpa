package com.lucas.project.config;

import com.lucas.project.entities.User;
import com.lucas.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Lucas", "lucas@gmail.com", "123456789", "12345");
        User u2 = new User(null, "Dimas", "dimas@gmail.com", "987654321", "00000");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
