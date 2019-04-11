package ru.job4j.condition;
/**
 * @author Alex Voronin
 * @since 11.04.2019
 * @version 1
 */
public class Max {
    /**
     * Возвращает максимальное число из двух заданных
     * @param left первое число
     * @param right второе число
     * @return максимальное
     */
    public int max(int left, int right) {

        /*тернарная конструкция
        */
        return left > right ? left : right;
}
}
