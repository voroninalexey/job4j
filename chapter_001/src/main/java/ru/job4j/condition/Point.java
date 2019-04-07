package ru.job4j.condition;

/**  Программа вычисления расстояния между двумя точками в системе координат (x,y).
 *@author alexvoronin
 *@since 05.04.2019
 *@version 1
 */
public class Point {
    public double distance(int x1, int y1, int x2, int y2) {
        /*
        возведение числа в степень
         */
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        /*
        извлечение квадратного корня из числа
         */
        return Math.sqrt(first + second);
    }
}
