package com.example.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	// Método para acessar os usuários
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Dimas", "dimas@gmail.com", "999999999", "12345");
		return ResponseEntity.ok().body(u);	
	}
}
