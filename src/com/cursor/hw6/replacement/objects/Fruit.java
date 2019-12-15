package com.cursor.hw6.replacement.objects;

public class Fruit {
    private int id = 1000;
    private String name;
    private String color;

    public Fruit(String[] configOfFruit) {
        this.id++;
        this.name = configOfFruit[0];
        this.color = configOfFruit[1];
    }

}
