package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class test BubbleSortTest
 */
public class BubbleSortTest {
    @Test
    public void whenBubbleSortThenSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayTest = {5, 1, 2, 7, 3};
        int[] resultArray = {1, 2, 3, 5, 7};
        assertThat(resultArray, is(bubbleSort.sort(arrayTest)));
    }

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayTest = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] resultArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(resultArray, is(bubbleSort.sort(arrayTest)));
    }

}
