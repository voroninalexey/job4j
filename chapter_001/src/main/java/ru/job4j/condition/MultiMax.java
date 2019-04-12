package ru.job4j.condition;

/**
 * @author Alex Voronin
 * @since 12.04.2019
 * @version 1
 */
public class MultiMax {
    /**
     * Возвращает максимальное число из трех заданных
     *
     * @param first  первое число
     * @param second второе число
     * @param third  третье число
     * @return максимальное
     */

    public int max(int first, int second, int third) {
        int result;
        result = first < second ? second : first;
        result = third > result ? third : result;

      //  if (first < second) {
       //     result = second;
      //  } else if (result < third) {
        // result = third;
      //  }
        return result;
    }
}
