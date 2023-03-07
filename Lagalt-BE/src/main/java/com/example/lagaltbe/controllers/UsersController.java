package com.example.lagaltbe.controllers;


import com.example.lagaltbe.models.Users;
import com.example.lagaltbe.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "api/v1/users")
public class UsersController {
    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping // GET: localhost:8080/api/v1/users
    public ResponseEntity<Collection<Users>> getAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("{id}") // GET: localhost:8080/api/v1/users/1
    public ResponseEntity<Users> getById(@PathVariable int id) {
        return ResponseEntity.ok(userService.findById(id));
    }
}
