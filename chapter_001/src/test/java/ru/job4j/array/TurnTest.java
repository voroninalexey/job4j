package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 *@author Alex Voronin
 *@since 17.04.2019
 *@version 1
 */
public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn turner = new Turn();
        int[] input = new int[] {5, 4, 1, 6, 2, 3, 7};
        int[] result = turner.back(input);
        int[] expect = new int[] {7, 3, 2, 6, 1, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOneElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива одним элементом, например {5}.
        Turn turner = new Turn();
        int[] input = new int[] {5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5};
        assertThat(result, is(expect));
    }

}
