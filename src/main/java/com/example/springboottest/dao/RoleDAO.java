package com.example.springboottest.dao;

import com.example.springboottest.model.Role;

import java.util.List;

public interface RoleDAO {
    List<Role> getAllRoles ();
    Role getRole(String userRole);
    List<Role> getRoleById(List<Long> roles);
    void addRole(Role role);
    void removeRole(List<Long> roles);
    void updateRole(Role role);
}
