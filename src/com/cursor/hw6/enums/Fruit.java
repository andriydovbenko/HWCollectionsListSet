package com.cursor.hw6.enums;

public enum Fruit {
    APPLE("Apple"),
    ORANGE("Orange"),
    GRAPEFRUIT("Grapefruit"),
    NECTARINE("Nectarine"),
    BERRY("Berry");

    private String fruit;

    Fruit(String fruit) {
        this.fruit = fruit;
    }

    public String getName() {
        return fruit;
    }
}