package com.cursor.hw6.similarity;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SimilarElement<T extends Comparable<T>> {
    private List<T> firstList;
    private List<T> secondList;

    public SimilarElement(List<T> firstList, List<T> secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }

    public void checkOutSimilarity() {
        Set<T> intersection = firstList.stream().filter(secondList::contains).collect(Collectors.toSet());
        System.out.println((intersection.isEmpty()) ?
                "There are no similar items between the two lists" :
                "Similar elements: " + intersection.toString());
    }
}
