package com.example.demoddd.domain.repository;

import com.example.demoddd.domain.entity.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);

    void save(User user);
}
