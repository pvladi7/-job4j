package ru.job4j.array;

/**
 * class FindLoop
 */
public class FindLoop {
    /**
     * method indexofK
     *
     * @param data
     * @param el
     * @return int
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}

