package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *@author Alex Voronin
 *@since 18.04.2019
 *@version 1
 */
public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька,
        // например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        BubbleSort sorter = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] resultArray = sorter.sort(input);
        int[] expectArray = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(resultArray, is(expectArray));
    }
    @Test
    public void whenSortArrayWithFiveElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 5 элементов c отрицательными значениями методом пузырька,
        // например {-1, -5, -4, -2, -3}.
        BubbleSort sorter = new BubbleSort();
        int[] input = new int[] {-1, -5, -4, -2, -3};
        int[] resultArray = sorter.sort(input);
        int[] expectArray = new int[] {-5, -4, -3, -2, -1};
        assertThat(resultArray, is(expectArray));
    }
}