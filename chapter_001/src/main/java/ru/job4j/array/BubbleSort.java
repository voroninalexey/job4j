package ru.job4j.array;
/**
 *@author Alex Voronin
 *@since 18.04.2019
 *@version 1
 */
public class BubbleSort {
    /**
     * сортировка массива методом перестановки (методом "пузырька").
     */
    public int[] sort(int[] array) {
        for (int j = array.length - 1; j != 0; j--) {
            for (int index = 0; index != j; index++) {
                if (array[index] > array[index + 1]) {
                    int tmp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = tmp;
                }
            }
        }
        return array;

    }
}
