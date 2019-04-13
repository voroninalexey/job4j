package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *@author Alex Voronin
 *@since 12.04.2019
 *@version 1
 */
public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10
        // при вызове метода counter.add будет равна 30.
    Counter counter = new Counter();
    int result = counter.add();
    assertThat(result, is(30));
    }
}
