package ru.job4j.loop;
/**
 *@author Alex Voronin
 *@since 12.04.2019
 *@version 1
 */
public class Counter {
    /** Вычисление суммы ЧЕТНЫХ чисел от 1 до 10 включительно.
     * @return сумма чисел
     */
    public int add() {
        int sum = 0;
        int start = 0;
        int finish = 10;
        for (; start <= finish; ++start) {
            if (start % 2 == 0) {
                sum = sum + start;
            }
        }
        return sum;
    }

}