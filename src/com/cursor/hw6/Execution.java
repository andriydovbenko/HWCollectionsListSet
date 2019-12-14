package com.cursor.hw6;

import com.cursor.hw6.replacement.strings.ListWithFruits;
import com.cursor.hw6.replacement.digits.ListWithIntegers;
import com.cursor.hw6.similarity.SimilarElement;

import java.util.ArrayList;
import java.util.Arrays;
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

        System.out.println("\n Task 3");
        List<Integer> listInteger1 = new ArrayList<>(Arrays.asList(2,3,5,8,12,15,15));
        List<Integer> listInteger2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        SimilarElement<Integer> stringSimilarElement = new SimilarElement<>(listInteger1,listInteger2);
        stringSimilarElement.checkOutSimilarity();

        List<String> listString1 = new ArrayList<>(Arrays.asList("Apple","Orange","Grapefruit","Berry"));
        List<String> listString2 = new ArrayList<>(Arrays.asList("Nectarine","Berry"));
        SimilarElement<String> stringSimilarElement1 = new SimilarElement<>(listString1,listString2);
        stringSimilarElement1.checkOutSimilarity();

    }
}

