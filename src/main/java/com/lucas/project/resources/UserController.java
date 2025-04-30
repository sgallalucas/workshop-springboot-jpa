package com.lucas.project.resources;

import com.lucas.project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @GetMapping
    public ResponseEntity<User> userAccess(){
        User user = new User(1l, "Lucas", "lucas@gmail.com", "123456789", "00000");
        return ResponseEntity.ok().body(user);
    }

}
