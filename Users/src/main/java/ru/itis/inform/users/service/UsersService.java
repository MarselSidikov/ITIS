package ru.itis.inform.users.service;

import ru.itis.inform.users.dao.models.User;

import java.util.List;

public interface UsersService {
    /**
     * Add some user
     * @param user information about user
     * @return id of user
     */
    int addUser(User user);

    User getUserById(int id);

    List<User> getAllUsers();

    List<User> getUsersBySex(String sex);

    List<User> getUsersByAge(int age);
}
