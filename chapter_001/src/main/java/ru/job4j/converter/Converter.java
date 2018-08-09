package ru.job4j.converter;

/**
 * Class Converter - currency converter
 */
public class Converter {
    /**
     * Converter rub in eur
     *
     * @param value rub
     * @return euro
     */
    public int rubleToEuro(int value) {

        return value / 76;
    }

    /**
     * Converter rub in dollars
     *
     * @param value rub
     * @return dollars
     */
    public int rubleToDollar(int value) {

        return value / 66;
    }

    /**
     * Converter euro in rub
     *
     * @param value rub
     * @return euro
     */
    public int euroToRuble(int value) {

        return value * 76;
    }

    /**
     * Converter dollars in rub
     *
     * @param value rub
     * @return dollars
     */
    public int dollarToRuble(int value) {

        return value * 66;
    }
}
