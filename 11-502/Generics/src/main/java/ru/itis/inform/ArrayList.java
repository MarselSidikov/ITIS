package ru.itis.inform;

import java.lang.reflect.Array;

public class ArrayList<T> {

    private final int MAX_SIZE = 100;

    // ИСПОЛЬЗУЕМ МАССИВ OBJECT
    private Object elements[];

    private int count;
    public ArrayList() {
        elements = new Object[MAX_SIZE];
    }

    public void add(T element) {
        this.elements[count] = element;
        count++;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= 0 && index < this.count) {
            return (T)this.elements[index];
        } else throw new IllegalArgumentException();
    }
}
