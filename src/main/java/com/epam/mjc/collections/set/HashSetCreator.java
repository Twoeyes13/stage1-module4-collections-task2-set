package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer digit :
                sourceList) {
            if (digit % 2 == 0) {
                while (digit % 2 == 0) {
                    set.add(digit);
                    digit = digit / 2;
                }
                set.add(digit);
            } else {
                set.add(digit);
                set.add(digit * 2);
            }


        }
        return set;
    }
}
