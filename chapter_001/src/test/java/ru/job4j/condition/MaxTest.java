package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/** Тест
 * @author Alex Voronin
 * @since 11.04.2019
 * @version 1
 */
    public class MaxTest {
    /**
     *тест второе больше первого
     */
    @Test
        public void whenMax1To2Then2() {
            Max max = new Max();
            int result = max.max(1, 2);
            assertThat(result, is(2));
        }

    /**
     * тест первое больше второго
     */
    @Test
    public void whenMax2To1Then2() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }

    /**
     * тест оба числа одинаковые
     */
    @Test
    public void whenMax2To2Then2() {
        Max max = new Max();
        int result = max.max(2, 2);
        assertThat(result, is(2));
    }
    }
