package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * MaxTest
 */
public class MaxTest {
    /**
     * whenFirstLessSecond method test
     */
    Max maxim = new Max();

    @Test
    public void whenFirstLessSecond() {
        int result = maxim.max(2, 1);
        assertThat(result, is(2));
    }
    /**
     *  maximumOfThree method test
     */
    @Test
    public void maximumOfThree() {
        Max maxim = new Max();
        int result = maxim.max(2, 5, 3);
        assertThat(result, is(5));
    }
}
