package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/** Тест конвертера валюты
 *
 *   @author AlexVoronin
 *   @version 1
 *   @since 04.05.2019
 */
public class ConverterTest {
    /**
     * Тест метода обмена рублей на доллары
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * тест метода обмена рублей на евро
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * тест метода обмена долларов на рубли
     */
    @Test
    public void whenDollarToRubleThen60() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(1);
        assertThat(result, is(60));
    }

    /**
     * тест метода обмена евро на рубли
     */
    @Test
    public void whenEuroToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(70));
    }
}
