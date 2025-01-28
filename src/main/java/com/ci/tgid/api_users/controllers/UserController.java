package com.ci.tgid.api_users.controllers;

import com.ci.tgid.api_users.domain.entities.User;
import com.ci.tgid.api_users.dtos.UserCreateDTO;
import com.ci.tgid.api_users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserCreateDTO userCreateDTO){
        return ResponseEntity.ok(service.create(userCreateDTO));
    }
}
