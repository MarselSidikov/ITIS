package ru.itis.inform.store.dao;


import ru.itis.inform.store.dao.models.Item;

public interface ItemsDao {

    /**
     * Удаляет товар из хранилища
     * @param itemName
     */
    void delete(String itemName);

    /**
     * Возвращает описание товара из БД
     * @param itemName
     * @return
     */
    Item select(String itemName);
}
