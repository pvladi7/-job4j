package ru.job4j.array;

/**
 * class BubbleSortComb
 */
public class BubbleSort {
    /**
     * method bubble sort
     * @param array
     * @return array sort
     */


    public int[] sort(int[] array) {
        int ind = 0;
        int length = array.length - 1;
        boolean flag;
        for (int i = 0; i <= length; i++) {
            flag = true;
            if(i == length){
                i = 0; ind = 0; length--;
            }
            if (array[ind] > array[ind + 1]) {
                array[ind]     ^= array[ind + 1];
                array[ind + 1] ^= array[ind];
                array[ind]     ^= array[ind + 1];
                flag = false;
            }
            if ((flag)&& (i == length)) {break;}
            ind++;
        }
        return array;
    }
}
