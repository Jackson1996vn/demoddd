package com.example.demoddd.domain.service;

import com.example.demoddd.domain.entity.User;

import java.util.Optional;

public interface UserService {

    void createUser(User user);

    Optional<User> getUserById(Long id);
}
