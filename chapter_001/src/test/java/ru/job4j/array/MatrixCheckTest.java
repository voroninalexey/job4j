package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 *@author Alex Voronin
 *@since 19.04.2019
 *@version 1
 */
public class MatrixCheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    public void whenDataMonoThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false},
                {false, true},
                };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataNotMonoThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false},
                {true, true},
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
