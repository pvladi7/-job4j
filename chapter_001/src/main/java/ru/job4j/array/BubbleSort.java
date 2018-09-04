package ru.job4j.array;

/**
 * class BubbleSortComb
 */
public class BubbleSort {
    /**
     * method sort algorithm comb
     * @param array
     * @return array sort
     */

    private double reduction_factor = 1.247390;
    private int num_permutations;

    private void swap(int[] array, int i) {
        int temp;
        temp =  array[i];
        array[i] = array[i+1];
        array[i+1] = temp;
    }

    public int[] sort(int[] array) {
        int step = array.length - 1;
        int temp;
        while (step >= 1) {
            for (int i = 0; i + step < array.length; ++i) {
                if (array[i] > array[i + step]) {
                    swap(array, i);
                   num_permutations++;
                }
            } step /= reduction_factor;
        }

        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                    swapped = true;
                    ++num_permutations;
                }
            }
            if (!swapped)
                break;
        }
        return array;
    }


}
