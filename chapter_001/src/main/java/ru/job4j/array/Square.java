package ru.job4j.array;
/**
 *@author Alex Voronin
 *@since 16.04.2019
 *@version 1
 */
public class Square {
    /**
     * заполнение массива элементами от 1 до bound возведенными в квадрат
     * @param bound размер массива
     * @return массив
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int index = 0; index != bound; index++) {
            rst[index] = (index + 1) * (index + 1);
        }
        return rst;
    }
}