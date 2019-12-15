package com.cursor.hw6.replacement.objects;

import com.cursor.hw6.enums.ListOfFruits;

public class Fruit {
    private final String FRUIT = ListOfFruits.Orange.getName();
    private static int counter = 1000;
    private int id;
    private String name;
    private String color;


    public Fruit(String[] configOfFruit) {
        id = counter++;
        this.name = configOfFruit[0];
        this.color = configOfFruit[1];
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }
}