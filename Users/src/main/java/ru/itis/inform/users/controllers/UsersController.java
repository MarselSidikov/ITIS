package ru.itis.inform.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.inform.users.dao.models.User;
import ru.itis.inform.users.service.UsersService;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService service;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return service.getAllUsers();
    }
}
