package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 *@author Alex Voronin
 *@since 19.04.2019
 *@version 1
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate array = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Привет", "Мир", "Привет", "Супер", "Мир", "Привет"};
        String[] result = array.remove(input);
        String[] expected = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, is(expected));
    }
    @Test
    public void whenRemoveDuplicatesThenArrayNoDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate array = new ArrayDuplicate();
        String[] input = new String[] {"Мир", "Привет", "Привет", "Привет", "Привет", "Привет", "Привет", "Привет"};
        String[] result = array.remove(input);
        String[] expected = new String[] {"Привет", "Мир"};
        assertThat(result, arrayContainingInAnyOrder(expected));
    }
}
