package ru.job4j.array;

/**
 * class BubbleSort
 */
public class BubbleSort {
    /**
     * method sort
     * @param array
     * @return array sort
     */
    public int[] sort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                  tmp = array[j + 1];
                  array[j + 1] = array[j];
                  array[j] = tmp;
                }
            }
        }
        return array;
    }
}
