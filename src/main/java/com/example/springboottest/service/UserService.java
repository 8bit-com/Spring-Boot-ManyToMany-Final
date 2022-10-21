package com.example.springboottest.service;

import com.example.springboottest.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserById(long id);

    User getUserByLogin(String username) ;
}
