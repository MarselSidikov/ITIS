package ru.itis.inform;


public interface List {

    /**
     * Добавить элемент в начало списка
     * @param element значение добавляемого элемента
     */
    void add(int element);

    /**
     * Удаление элемента по значению
     * @param element значение элемента
     */
    void remove(int element);
}
