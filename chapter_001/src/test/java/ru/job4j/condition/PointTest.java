package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/** Тест.
@author alexvoronin
@since 05.04.2019
@version 1
*/
public class PointTest {
    /**
    Проверка метода вычисления расстояния между двумя точками в системе координат (x,y)
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point();
        double result = point.distance(0, 0, 0, 10);
        assertThat(result, is(10D));
    }
}