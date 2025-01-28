package com.ci.tgid.api_users.services;

import com.ci.tgid.api_users.domain.entities.User;
import com.ci.tgid.api_users.dtos.UserCreateDTO;
import com.ci.tgid.api_users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User create(UserCreateDTO userCreateDTO) {
        validUsername(userCreateDTO.getUsername());

        return repository.save(
                new User(
                        null,
                        userCreateDTO.getUsername(),
                        userCreateDTO.getPassword())
        );
    }

    public void validUsername(String username){
        if (username.length() <= 3) {
            throw new IllegalArgumentException("o username deve ter 3 ou mais caracteres");
        }
    }
}
