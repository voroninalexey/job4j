package ru.job4j.array;
/**
 *@author Alex Voronin
 *@since 19.04.2019
 *@version 1
 */
public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if  (data [data.length - i - 1][i] != data [data.length - i - 2][i + 1]) {
                result = false;
                break;
            } else if (data [i][i] != data [i + 1][i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
