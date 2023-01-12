package com.example.demoddd.domain.service;

import com.example.demoddd.domain.entity.User;
import com.example.demoddd.domain.repository.UserRepository;

import java.util.Optional;

public class DomainUserService implements UserService {

    private final UserRepository userRepository;

    public DomainUserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
