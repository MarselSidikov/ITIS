package ru.itis.inform.users.service;

import org.springframework.stereotype.Service;
import ru.itis.inform.users.dao.models.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    public List<User> getAllUsers() {
        User userMarsel = new User(1, "Marsel", 22, "male", null);
        User userVicktor = new User(2, "Vicktor", 19, "male", null);
        User userAlina = new User(3, "Alina", 19, "female", null);

        List<User> users = new ArrayList<User>();
        users.add(userMarsel);
        users.add(userVicktor);
        users.add(userAlina);

        return users;
    }

    public int addUser(User user) {
        return 0;
    }

    public User getUserById(int id) {
        return null;
    }

    public List<User> getUsersBySex(String sex) {
        return null;
    }

    public List<User> getUsersByAge(int age) {
        return null;
    }
}
