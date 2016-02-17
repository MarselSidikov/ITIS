package ru.itis.inform;


public interface List<T> {

    /**
     * Добавить элемент в начало списка
     * @param element значение добавляемого элемента
     */
    void add(T element);

    /**
     * Удаление элемента по значению
     * @param element значение элемента
     */
    void remove(T element);

    /**
     * Возвращает итератор по нашей коллекции
     * @return возвращаемый итератор
     */
    Iterator<T> iterator();
}
