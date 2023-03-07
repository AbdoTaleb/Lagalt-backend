package com.example.lagaltbe.controllers;


import com.example.lagaltbe.models.Users;
import com.example.lagaltbe.repositories.UserRepository;
import com.example.lagaltbe.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/users")
public class UsersController {
    private final UserService userService;
    private final UserRepository userRepository;

    public UsersController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping // GET: localhost:8080/api/v1/users
    public ResponseEntity<Collection<Users>> getAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("{id}") // GET: localhost:8080/api/v1/users/1
    public ResponseEntity<Users> getById(@PathVariable int id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @GetMapping("/name") // GET: localhost:8080/api/v1/users?user_name=User1
    public ResponseEntity<Users> findByName(@RequestParam String name) {
        return new ResponseEntity<Users>(userRepository.findByName(name), HttpStatus.OK);
    }
}
