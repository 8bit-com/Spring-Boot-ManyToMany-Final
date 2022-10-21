package com.example.springboottest.service;

import com.example.springboottest.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role getRole(String userRole);

    List<Role> getRoleById(List<Long> roles);

    void addRole(Role role);
}
