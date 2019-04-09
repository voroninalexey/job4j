package ru.job4j.condition;
/**  Программа вычисления расстояния между двумя точками в системе координат (x,y).
 *@author alexvoronin
 *@since 05.04.2019
 *@version 1
 */
public class Point {
    /**
     * Метод определения расстояния между двумя точками
     * @param x1 координаты
     * @param y1 координаты
     * @param x2 координаты
     * @param y2 координаты
     * @return расстояние между двумя точками
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }
}
