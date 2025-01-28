package com.ci.tgid.api_users.services;

import com.ci.tgid.api_users.dtos.UserCreateDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService service;

    @Test
    void shouldThrowErrorWhenUsernameIsInvalid() {
        UserCreateDTO userCreateDTO = new UserCreateDTO("adm","123456");

        assertThrows(IllegalArgumentException.class,() -> service.create(userCreateDTO));
    }
}