package ru.job4j.loop;
/**
 *@author Alex Voronin
 *@since 14.04.2019
 *@version 1
 */
public class Board {
    /**
     *  программа для построения шахматной доски, состоящей из Х и пробелов.
     * @param width ширина доски
     * @param height высота доски
     * @return построение шахматной доски
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int j = 0; j < height; ++j) {
            for (int i = 0; i < width; ++i) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
