package ru.job4j.condition;

  /**
  *@author Alex Voronin
  *@since 12.04.2019
  *@version 1
 */
 public class Triangle {
    /**
   * Метод вычисления периметра по длинам сторон.
   *
   * Формула.
   *
   * (a + b + c) / 2
   *
   * @param a расстояние между точками a b
   * @param b расстояние между точками a c
   * @param c расстояние между точками b c
   * @return полупериметр треугольника.
   */
      public double period(double a, double b, double c) {
      return (a + b + c) / 2;
      }

      /**
       * Метод должен вычислить прощадь треугольника.
       *
       * Формула.
       *
       * √ p *(p - ab) * (p - ac) * (p - bc)
       *
       * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
       *
       * @return Вернуть прощадь, если треугольник существует или -1.
       */
      public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
          double rsl = -1;
          double a = new Point().distance(x1, y1, x2, y2);
          double b = new Point().distance(x2, y2, x3, y3);
          double c = new Point().distance(x1, y1, x3, y3);
          double p = period(a, b, c);

          if (this.exist(x1, x2, x3, y1, y2, y3)) {
              // написать формулу для расчета площади треугольника.
              rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
          }
          return rsl;
      }

      /**
       * Метод проверяет коллинеарность сторон треугольника
       *
       * @param x1 координаты
       * @param x2 координаты
       * @param x3 координаты
       * @param y1 координаты
       * @param y2 координаты
       * @param y3 координаты
       * @return  можно ли построить треугольник
       */

      private boolean exist(double x1, double x2, double x3, double y1, double y2, double y3) {

          return x1 / x2 != y1 / y2 & x2 / x3 != y2 / y3 & x1 / x3 != y1 / y3;


      }

      }
