package com.cursor.hw6;

import com.cursor.hw6.enums.Fruit;
import com.cursor.hw6.replacement.strings.ListWithFruits;
import com.cursor.hw6.replacement.digits.ListWithIntegers;
import com.cursor.hw6.similarity.SimilarElement;
import com.cursor.hw6.sorting.StringInDESC;

import java.util.*;

public class Execution {

    public void startProject() {
        System.out.println(" Task 1");
        ListWithIntegers listWithIntegers = new ListWithIntegers();
        listWithIntegers.createList();
        listWithIntegers.replaceDigit();
        listWithIntegers.printList();

        System.out.println(" Task 2");
        List<String> fruits = new ArrayList<>();
        fruits.add(Fruit.APPLE.getName());
        fruits.add(Fruit.ORANGE.getName());
        fruits.add(Fruit.GRAPEFRUIT.getName());
        fruits.add(Fruit.NECTARINE.getName());
        fruits.add(Fruit.BERRY.getName());
        fruits.add(Fruit.ORANGE.getName());
        ListWithFruits listWithFruits = new ListWithFruits(fruits);
        System.out.println(listWithFruits.replaceOrangeToGrapefruit());

        System.out.println("\n Task 3");
        List<Integer> listInteger1 = new ArrayList<>(Arrays.asList(2, 3, 5, 8, 12, 15, 15));
        List<Integer> listInteger2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        SimilarElement<Integer> stringSimilarElement = new SimilarElement<>(listInteger1, listInteger2);
        stringSimilarElement.checkOutSimilarity();

        List<String> listString1 = new ArrayList<>(Arrays.asList(Fruit.APPLE.getName(),
                Fruit.ORANGE.getName(), Fruit.GRAPEFRUIT.getName(), Fruit.BERRY.getName()));
        List<String> listString2 = new ArrayList<>(Arrays.asList(Fruit.NECTARINE.getName(), Fruit.BERRY.getName()));
        SimilarElement<String> stringSimilarElement1 = new SimilarElement<>(listString1, listString2);
        stringSimilarElement1.checkOutSimilarity();

        System.out.println("\n Task 4");
        TreeSet<String> treeSet = new TreeSet<>(new StringInDESC());
        treeSet.add(Fruit.NECTARINE.getName());
        treeSet.add(Fruit.APPLE.getName());
        treeSet.add(Fruit.ORANGE.getName());
        treeSet.add(Fruit.BERRY.getName());
        System.out.println("TreeSet in descending order:\n" + treeSet);
    }
}