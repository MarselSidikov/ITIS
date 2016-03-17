package ru.itis.inform.users.dao;


import ru.itis.inform.users.dao.models.User;

import java.util.List;

public interface UsersDao {
    List<User> getUsers();
}
