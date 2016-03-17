package ru.itis.inform.users.dao.models;

public class Auto {
    private int id;
    private String model;
    private String number;
    private String country;

    public Auto(int id, String model, String number, String country) {
        this.id = id;
        this.model = model;
        this.number = number;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public String getCountry() {
        return country;
    }
}
