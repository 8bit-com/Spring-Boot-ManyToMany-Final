package com.example.springboottest.dao;

import com.example.springboottest.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers ();
    User getUserById(long id);
    void saveUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
    User getUserByLogin(String username);
}
