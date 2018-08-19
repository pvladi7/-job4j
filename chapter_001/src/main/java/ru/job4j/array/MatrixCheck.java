package ru.job4j.array;

/**
 * class MatrixCheck
 */
public class MatrixCheck {
    /**
     * method mono
     * @param data
     * @return boolean
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i][i] != data[i + 1][i + 1]) || (data[i][data.length - 1 - i] != data[i + 1][data.length - i - 2])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
