package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (Integer digit :
                sourceList) {
            set.add(digit * digit);
        }

        return (TreeSet<Integer>) set.subSet(lowerBound, upperBound + 1);
    }
}
