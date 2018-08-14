package ru.job4j.loop;

/**
 * Created by whp on 15.08.2018.
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    Factorial factorial = new Factorial();

    /**
     * Test method whenCalculateFactorialForFiveThenOneHundreedTwenty
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int expected = 120;
        int result = factorial.calc(5);
        assertThat(result, is(expected));
    }

    /**
     * Test method whenCalculateFactorialForZeroThenOne
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int result = factorial.calc(0);
        assertThat(result, is(expected));
    }
}
