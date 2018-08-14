package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by whp on 14.08.2018.
 */
public class CounterTest {
    Counter counter = new Counter();

    /**
     * Test method whenSumEvenNumbersFromOneToTenThenThirty
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
       int expected = 30;
       int result = counter.add(1, 10);
       assertThat(result, is(expected));
    }
}
