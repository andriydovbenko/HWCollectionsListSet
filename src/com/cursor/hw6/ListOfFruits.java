package com.cursor.hw6;

import com.cursor.hw6.replacement.objects.Fruit;

public enum ListOfFruits {
    Apple("Apple", "Red"),
    Orange("Orange", "Orange"),
    Grapefruit("Grapefruit", "Pink"),
    Nectarine("Nectarine", "Yellow"),
    Berry("Berry", "White");

    private String fruit;
    private String [] config;

    ListOfFruits(String fruit, String color) {
        this.fruit = fruit;
        this.config = new String[]{fruit, color};
    }

    public String getName() {
        return fruit;
    }
    public String [] getNameAndColor(){
        return config;
    }
}
