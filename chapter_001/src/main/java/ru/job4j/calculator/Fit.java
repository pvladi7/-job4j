package ru.job4j.calculator;

/**
 *  Class Fit - to calculate the ideal weight for a woman and a man
 */
public class Fit {
    /**
     * Ideal weight for man
     * @param height
     * @return ideal weight for man
     */
    public double manWeight(double height) {
        return (height - 100)*1.15;
    }

    /**
     * Ideal weight for woman
     * @param height
     * @return ideal weight for woman
     */
    public double womanWeight(double height) {
        return (height - 110)*1.15;
    }
}
