package com.company;


public class Human {

    public static String nation;
    /**
     * Константы
     */
    private static final int  MAX_AGE = 100;
    private static final String DEFAULT_NAME = "default";

    /**
     * Поля
     */
    private int age;
    private String name;

    /**
     * Конструкторы
     */
    public Human() {
        this.age = MAX_AGE;
        this.name = DEFAULT_NAME;
    }

    /**
     * Конструктор с параметрами
     * @param age
     * @param name
     */
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * Методы
     */
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getStaticNation() {
        return nation;
    }
}
