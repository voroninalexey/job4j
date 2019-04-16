package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *@author Alex Voronin
 *@since 16.04.2019
 *@version 1
 */
public class FindLoopTest {
    /**
     * тест на поиск элемента в массиве с определением индекса этого элемента.
     * нахождение элемента.
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    /**
     * тест на поиск элемента в массиве с определением индекса этого элемента.
     * элемент не найден.
     */
    @Test
    public void whenArrayHas5ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {4, 10, 3, 7};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
