package ru.job4j.calculator;
/**
 * Calculator класс для вычисления арифметических операций
 * @author alexvoronin
 * @since 05.04.2019
 * @version 1
 */
public class Calculator {
    /*
     * add метод вычисления суммы двух чисел
     */
    public double add(double first, double second) {
        return first + second;
    }
    /*
     * subtract метод вычисления разности двух чисел
     */
    public double subtract(double first, double second) {
        return first - second;
    }
    /*
     * div метод вычисления частного двух чисел
     */
    public double div(double first, double second) {
        return first / second;
    }
    /*
     * multiple метод вычисления произведения двух чисел
     */
    public double multiple(double first, double second) {
        return first * second;
    }

}
