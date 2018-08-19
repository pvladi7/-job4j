package ru.job4j.loop;

/**
 * class Board
 * @author Pavel Vladi(mailto:w.h.81@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     * method paint
     * @param width
     * @param height
     * @return String
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (0 == (i + j) % 2) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}

