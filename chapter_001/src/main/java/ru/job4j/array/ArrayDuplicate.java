package ru.job4j.array;

import java.util.Arrays;
/**
 *@author Alex Voronin
 *@since 19.04.2019
 *@version 1
 */
public class ArrayDuplicate {
    /**
     * Метод удаляет дубликаты в массиве.
     * @param array массив
     * @return массив с уникальными элементами.
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}