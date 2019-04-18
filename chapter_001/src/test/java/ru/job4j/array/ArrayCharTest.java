package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 *@author Alex Voronin
 *@since 17.04.2019
 *@version 1
 */
public class ArrayCharTest {
    /**
     * тест работы метода сравнивания префикса со строкой, когда префикс совпадает.
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }
    /**
     * тест работы метода сравнивания префикса со строкой, когда префикс НЕ совпадает.
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }
}
