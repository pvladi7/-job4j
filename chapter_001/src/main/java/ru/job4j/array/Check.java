package ru.job4j.array;

/**
 * class Check
 */
public class Check {
    /**
     * method mono
     * @param  data
     * @return boolean
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i] ? 1 : 0;
        }
        if ((sum == 0) || (sum == data.length)) {
            result = true;
        }
        return result;
    }
}
