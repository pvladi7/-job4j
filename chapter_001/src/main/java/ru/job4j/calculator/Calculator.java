package ru.job4j.calculator;

/**
 * Class Calculator task execution 001.
 * @author Pavel Vladi (mailto:w.h.81@mail.ru)
 * @since 31.07.2018
 */
public class Calculator {
    private double result;

    /**
     * The add method
     * @param first
     * @param second
     * @return this.result
     */
    public void add(double first, double second) {

        this.result = first + second;
    }

    /**
     * The sub method
     * @param first
     * @param second
     * @return this.result
     */
    public void sub(double first, double second) {

        this.result = first - second;
    }

    /**
     * The div method
     * @param first
     * @param second
     * @return this.result
     */
    public void div(double first, double second) {

         this.result = first / second;
    }

    /**
     * The mul method
     * @param first
     * @param second
     * @return this.result
     */
    public void mul(double first, double second) {

        this.result = first * second;
    }

    /**
     * The getResult method
     * @return this.result
     */
    public double getResult() {

        return this.result;
    }
}