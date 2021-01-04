package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> getUser(long id);
    void deleteUser(long  id);
    void saveUser(User user);
}
