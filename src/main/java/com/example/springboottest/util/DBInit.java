package com.example.springboottest.util;

import com.example.springboottest.model.Role;
import com.example.springboottest.model.User;
import com.example.springboottest.service.RoleService;
import com.example.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

//@Component
public class DBInit {
    private final UserService userService;
    private final RoleService roleService;

    //@Autowired
    public DBInit(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    //@PostConstruct
    private void dataBaseInit() {
        Role roleAdmin = new Role("ROLE_ADMIN");
        Role roleUser = new Role("ROLE_USER");
        List<Role> adminSet = new ArrayList<>();
        List<Role> userSet = new ArrayList<>();

        roleService.addRole(roleAdmin);
        roleService.addRole(roleUser);

        adminSet.add(roleAdmin);
        adminSet.add(roleUser);
        userSet.add(roleUser);

        User newUser = new User("Ivan", (byte)23, "ivan@mail.com", adminSet);
        User admin = new User("Garry", (byte) 30, "garry@gmail.com", userSet);

        userService.saveUser(newUser);
        userService.saveUser(admin);
    }
}