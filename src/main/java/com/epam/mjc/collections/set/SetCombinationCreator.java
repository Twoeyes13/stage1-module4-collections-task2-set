package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();
        for (String word :
                firstSet) {
            if (secondSet.contains(word) && !thirdSet.contains(word)) {
                resultSet.add(word);
            }
        }

        for (String word :
                thirdSet) {
            if (!firstSet.contains(word) && !secondSet.contains(word)) {
                resultSet.add(word);
            }
        }

        return resultSet;
    }
}
