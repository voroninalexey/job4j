package ru.job4j.array;
/**
 *@author Alex Voronin
 *@since 16.04.2019
 *@version 1
 */
public class FindLoop {
    /**
     * программа поиска элемента в массиве.
     * @param data заданный массива
     * @param el элемент, который нужно найти
     * @return индекс искомого элемента
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
