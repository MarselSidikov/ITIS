package ru.itis.inform.users.dao;

import ru.itis.inform.users.dao.models.Auto;

public interface AutoDao {
    Auto getAutoByUserId(int userId);
}
