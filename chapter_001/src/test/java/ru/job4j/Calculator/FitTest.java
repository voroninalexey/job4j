package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/** Test программы вычисления идеального веса.
 *
 * @author AlexVoronin
 * @version 1
 * @since 07.04.2019
 */
public class FitTest {
/*
Проверка определения идеального веса для мужчин
 */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }
/* Проверка определения идеального веса для женщин
 */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170.0);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}