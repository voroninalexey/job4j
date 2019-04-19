package ru.job4j.array;
/**
 *@author Alex Voronin
 *@since 19.04.2019
 *@version 1
*/
public class Matrix {
    /**
     * метод заполняет таблицу умножения.
     * @param size размер таблицы size * size.
     * @return заполненная таблица умножения.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
              table [i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
