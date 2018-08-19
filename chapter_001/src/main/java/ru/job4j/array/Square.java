package ru.job4j.array;

/**
 * class Square
 * @author pavel vladi(mailto:w.h.81@mail.ru)
 * @since $id$
 */
public class Square {
    /**
     * method calculate
     * @param bound
     * @return int[]
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}
