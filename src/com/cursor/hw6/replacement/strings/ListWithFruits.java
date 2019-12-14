package com.cursor.hw6.replacement.strings;

import java.util.List;

public class ListWithFruits {
    private List<String> listOfFruits;
    private String valueToReplace = "Orange";
    private String valueAfterReplace = "Grapefruit";

    public ListWithFruits(List<String> fruits) {
        this.listOfFruits = fruits;
    }

    public String replaceOrangeToGrapefruit() {
        String message;
        if (listOfFruits.isEmpty()) {
            message = "\nList of fruits is empty";
        } else if (listOfFruits.contains(valueToReplace)) {
            while (listOfFruits.contains(valueToReplace)) {
                listOfFruits.set(listOfFruits.indexOf(valueToReplace), valueAfterReplace);
                System.out.println(valueToReplace + " has transformed to " + valueAfterReplace);
            }
            message = "\nafter replace: " + listOfFruits.toString();
        } else {
            message = valueToReplace + "\ndoesn't present inside of this list";
        }
        return message;
    }
}