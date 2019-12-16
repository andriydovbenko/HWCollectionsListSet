package com.cursor.hw6.replacement.strings;

import java.util.Collections;
import java.util.List;

public class ListWithFruits {
    private List<String> listOfFruits;
    private String valueToReplace = "Orange";
    private String valueAfterReplace = "Grapefruit";

    public ListWithFruits(List<String> fruits) {
        this.listOfFruits = fruits;
        System.out.println("Original list: " + listOfFruits);
    }

    public String replaceOrangeToGrapefruit() {
        String message;
        if (Collections.replaceAll(listOfFruits, valueToReplace, valueAfterReplace)) {
            message = "Modified list : " + listOfFruits.toString();
        } else if (listOfFruits.isEmpty()) {
            message = "List of fruits is empty";
        } else {
            message = valueToReplace + " doesn't present inside of this list";
        }
        return message;
    }
}