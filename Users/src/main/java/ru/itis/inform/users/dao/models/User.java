package ru.itis.inform.users.dao.models;

public class User {
    private int id;
    private String name;
    private int age;
    private String sex;
    private Auto auto;

    public User(int id, String name, int age, String sex, Auto auto) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.auto = auto;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Auto getAuto() {
        return auto;
    }
}
