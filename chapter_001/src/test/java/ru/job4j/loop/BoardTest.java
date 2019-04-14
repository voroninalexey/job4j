package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *@author Alex Voronin
 *@since 14.04.2019
 *@version 1
 */
public class BoardTest {
    /**
     * тест построения шахматной доски 3 на 3 из Х и "".
     *
     */
    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
        ));
        System.out.println(rsl);
    }
    /**
     * тест построения шахматной доски 5 на 4 из Х и "".
     */
    @Test
    public void when5x4() {
        Board board = new Board();
        String rsl = board.paint(5, 4);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X X%s X X %sX X X%s X X %s", ln, ln, ln, ln)
                )
        );
        System.out.println(rsl);
    }
}
