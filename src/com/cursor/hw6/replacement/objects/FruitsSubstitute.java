package com.cursor.hw6.replacement.objects;

import com.cursor.hw6.enums.ListOfFruits;

import java.util.ArrayList;
import java.util.List;

public class FruitsSubstitute {
    private List<Fruit> fruitList;

    public FruitsSubstitute(List<Fruit> list) {
        this.fruitList = new ArrayList<>(list);
    }

    private void recursionReplacement(int recursiveNumber) {
        int length = fruitList.size();
        if (recursiveNumber != length) {
            String name = fruitList.get(recursiveNumber).getName();
            if (name.equals(ListOfFruits.Orange.getName())) {
                fruitList.set(recursiveNumber,
                        new Fruit(ListOfFruits.Grapefruit.getNameAndColor()));
            }
            recursionReplacement(++recursiveNumber);
        }
    }

    public List<Fruit> checkList() {
        int recursiveNumber = 0;
        recursionReplacement(recursiveNumber);
        return fruitList;
    }
}