package com.cursor.hw6.sorting;

import java.util.Comparator;

public class StringInDESC implements Comparator<String> {

    @Override
    public int compare(String variableFirst, String variableSecond) {
        return variableSecond.compareTo(variableFirst);
    }
}