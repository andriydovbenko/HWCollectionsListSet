package com.cursor.hw6;

import com.cursor.hw6.enums.ListOfFruits;
import com.cursor.hw6.replacement.strings.ListWithFruits;
import com.cursor.hw6.replacement.digits.ListWithIntegers;
import com.cursor.hw6.similarity.SimilarElement;
import com.cursor.hw6.sorting.StringInDESC;

import java.util.*;

public class Execution {
    private final String APPLE = ListOfFruits.Apple.getName();
    private final String ORANGE = ListOfFruits.Orange.getName();
    private final String GRAPEFRUIT = ListOfFruits.Grapefruit.getName();
    private final String NECTARINE = ListOfFruits.Nectarine.getName();
    private final String BERRY = ListOfFruits.Berry.getName();

    public void startProject() {
        System.out.println(" Task 1");
        ListWithIntegers listWithIntegers = new ListWithIntegers();
        listWithIntegers.createList();
        listWithIntegers.replaceDigit();
        listWithIntegers.printList();

        System.out.println(" Task 2");
        List<String> fruits = new ArrayList<>();
        fruits.add(APPLE);
        fruits.add(ORANGE);
        fruits.add(GRAPEFRUIT);
        fruits.add(NECTARINE);
        fruits.add(BERRY);
        fruits.add(ORANGE);
        ListWithFruits listWithFruits = new ListWithFruits(fruits);
        System.out.println(listWithFruits.replaceOrangeToGrapefruit());

        System.out.println("\n Task 3");
        List<Integer> listInteger1 = new ArrayList<>(Arrays.asList(2, 3, 5, 8, 12, 15, 15));
        List<Integer> listInteger2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        SimilarElement<Integer> stringSimilarElement = new SimilarElement<>(listInteger1, listInteger2);
        stringSimilarElement.checkOutSimilarity();

        List<String> listString1 = new ArrayList<>(Arrays.asList(APPLE, ORANGE, GRAPEFRUIT, BERRY));
        List<String> listString2 = new ArrayList<>(Arrays.asList(NECTARINE, BERRY));
        SimilarElement<String> stringSimilarElement1 = new SimilarElement<>(listString1, listString2);
        stringSimilarElement1.checkOutSimilarity();

        System.out.println("\n Task 4");
        TreeSet<String> treeSet = new TreeSet<>(new StringInDESC());
        treeSet.add(NECTARINE);
        treeSet.add(APPLE);
        treeSet.add(ORANGE);
        treeSet.add(BERRY);
        System.out.println("TreeSet in descending order:\n" + treeSet);
    }
}