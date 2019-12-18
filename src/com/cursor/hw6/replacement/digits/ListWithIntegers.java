package com.cursor.hw6.replacement.digits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListWithIntegers {

    private static final int INITIAL_CAPACITY_OF_LIST = 15;
    private static final int RANGE_OF_RANDOM = 100;
    private List<Integer> listOfDigit = new ArrayList<>(INITIAL_CAPACITY_OF_LIST);

    public void createList() {
        for (int i = 0; i < INITIAL_CAPACITY_OF_LIST; i++) {
            listOfDigit.add(new Random().nextInt(RANGE_OF_RANDOM));
        }
        System.out.println("List with random values has created:\n" + listOfDigit + "\n");
    }

    public void replaceDigit() {
        if (listOfDigit.isEmpty()) {
            System.out.println("List of Integers is empty");
        } else {
            for (int i = 0; i < listOfDigit.size(); i++) {
                Integer temp = listOfDigit.get(i);
                if (temp % 3 == 0) {
                    System.out.println("Digit removed: " + temp);
                    listOfDigit.remove(temp);
                    i--;
                }
            }
        }
    }

    public void printList() {
        System.out.println((listOfDigit.isEmpty()) ?
                "List of Integers is empty" :
                "\nafter removing size = " + listOfDigit.size() + "\n" + listOfDigit + "\n");
    }
}