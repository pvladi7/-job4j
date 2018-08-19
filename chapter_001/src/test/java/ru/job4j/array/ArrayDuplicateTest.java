package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * class ArrayDuplicateTest
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] inputArray = {"Hello", "!", "Hello", "World", "!"};
        String[] expect = {"Hello", "World", "!"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.removeDuplicate(inputArray);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
    @Test
    public void whenRemoveDuplicatesIntThenArrayWithoutDuplicateInt() {
        String[] inputArray = {"3", "2", "2", "3", "2"};
        String[] expect = {"3", "2"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.removeDuplicate(inputArray);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }

}
