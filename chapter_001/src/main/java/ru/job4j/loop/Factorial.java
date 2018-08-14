package ru.job4j.loop;

/**
 * class Factorial
 * @author Pavel Vladi(mailto:w.h.81@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * Method returns the calculated factorial of a number
     * @param n
     * @return factorial of a number
     */
    public int calc(int n) {
        int mul = 1;
        if (0 == n) {
            mul = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                mul *= i;
            }
        }
        return mul;
    }
}
