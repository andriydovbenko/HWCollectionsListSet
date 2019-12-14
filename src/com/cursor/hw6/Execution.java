package com.cursor.hw6;

import com.cursor.hw6.replacement.strings.ListWithFruits;
import com.cursor.hw6.replacement.digits.ListWithIntegers;

import java.util.ArrayList;
import java.util.List;

public class Execution {

    public void startProject() {
        System.out.println(" Task 1");
        ListWithIntegers listWithIntegers = new ListWithIntegers();
        listWithIntegers.createList();
        listWithIntegers.replaceDigit();
        listWithIntegers.printList();


        System.out.println(" Task 2");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapefruit");
        fruits.add("Nectarine");
        fruits.add("Berry");
        fruits.add("Orange");
        ListWithFruits listWithFruits = new ListWithFruits(fruits);
        System.out.println(listWithFruits.replaceOrangeToGrapefruit());
    }
}

