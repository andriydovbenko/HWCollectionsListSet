package com.cursor.hw6.enums;

public enum ListOfFruits {
    Apple("Apple", "Red"),
    Orange("Orange", "Orange"),
    Grapefruit("Grapefruit", "Pink"),
    Nectarine("Nectarine", "Yellow"),
    Berry("Berry", "White");

    private String fruit;
    private String[] config;

    ListOfFruits(String fruit, String color) {
        this.fruit = fruit;
        this.config = new String[]{fruit, color};
    }

    public String getName() {
        return fruit;
    }
}