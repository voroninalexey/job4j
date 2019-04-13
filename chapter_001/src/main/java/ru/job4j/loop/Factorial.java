package ru.job4j.loop;

/**
 *@author Alex Voronin
 *@since 13.04.2019
 *@version 1
 */
public class Factorial {
    /**
     * Вычисление факториала числа
     */
    public int calc(int n) {
        int result = 1;
        int i = 1;
        for (; i <= n; ++i) {
            result = result * i;
            }
        return result;
    }
}