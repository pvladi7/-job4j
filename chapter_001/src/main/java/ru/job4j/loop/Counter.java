package ru.job4j.loop;

/**
 * class Counter
 * @author Pavel Vladi(mailto:w.h.81@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Counter {
    /**
     * Add method calculating the sum of even numbers from start to finish
     * @param start
     * @param finish
     * @return sum even numbers
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (0 == i % 2) {
                sum += i;
            }
        }
        return sum;
    }
}
