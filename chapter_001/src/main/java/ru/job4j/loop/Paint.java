package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * class Paint
 * @author Pavel Vladi (mailto:w.h.81@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * method right
     * @param height
     * @return String
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * methid leftTrl
     * @param height
     * @return String
     */

    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * method pyramid
     * @param height
     * @return String
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * method loopby
     * @param height
     * @param weight
     * @param predict
     * @return String
     */
    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}