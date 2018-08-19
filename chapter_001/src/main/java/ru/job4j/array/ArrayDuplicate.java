package ru.job4j.array;

import java.util.Arrays;
/**
 * class ArrayDuplicate
 */
public class ArrayDuplicate {
    /**
     * method removeDuplicate
     * @param valueArray
     * @return unique values
     */
    public String[] removeDuplicate(String[] valueArray) {
        int uniqueValue = valueArray.length;
        for (int i = 0; i < uniqueValue; i++) {
            for (int j = i + 1; j < uniqueValue;  j++) {
                if (valueArray[i].equals(valueArray[j])) {
                    valueArray[j] = valueArray[uniqueValue - 1];
                    uniqueValue--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(valueArray, uniqueValue);
    }
}

