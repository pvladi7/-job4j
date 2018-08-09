package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Vladi (mailto:w.h.81@mail.ru).
 * @version $id$
 * @since 0.1
 */
public class CalculatorTest {
    Calculator calc = new Calculator();

    /**
     * Test method add
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test method sub
     */

    @Test
    public void whenSubOneFromTwoThenRes() {
        calc.sub(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     * Test method mul
     */
    @Test
    public void whenMulOneOnTwoThenRes() {
        calc.mul(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }

    /**
     * Test method div
     */
    @Test
    public void whenDivOneByTwoThenRes() {
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}