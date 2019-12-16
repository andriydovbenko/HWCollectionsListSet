package com.cursor.hw6.enums;

public enum ListOfFruits {
    Apple("Apple"),
    Orange("Orange"),
    Grapefruit("Grapefruit"),
    Nectarine("Nectarine"),
    Berry("Berry");

    private String fruit;

    ListOfFruits(String fruit) {
        this.fruit = fruit;
    }

    public String getName() {
        return fruit;
    }
}