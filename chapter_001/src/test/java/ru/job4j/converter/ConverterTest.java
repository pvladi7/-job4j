package ru.job4j.converter;

/**
 * Created by whp on 10.08.2018.
 */
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    Converter converter = new Converter();

    /**
     * Test method RubleToDollar
     */
    @Test
    public void when664RubleToDollarThen1() {
        int result = converter.rubleToDollar(66);
        assertThat(result, is(1));
    }

    /**
     * Test method RubleToEuro
     */
    @Test
    public void when76RubleToEuroThen1() {
        int result = converter.rubleToEuro(76);
        assertThat(result, is(1));
    }
    /**
     * Test method DollarToRub
     */
    @Test
    public void when1DollarToRubThen66() {
        int result = converter.dollarToRuble(1);
        assertThat(result, is(66));
    }
    /**
     * Test method EuroToRub
     */
    @Test
    public void when1EuroToRubThen76() {
        int result = converter.euroToRuble(1);
        assertThat(result, is(76));
    }

}
