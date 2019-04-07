package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

         /** Test.
         *
         * @author AlexVoronin
        * @version 1
        * @since 04.05.2019
         */
public class CalculatorTest  {
     /**
      * тест метода сложения чисел
      */
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

     /**
      * тест метода разности чисел
      */
    @Test
    public void whenSubtract2On1Then1() {
        Calculator calc1 = new Calculator();
        double result = calc1.subtract(2D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

     /**
      * тест метода частного чисел
      */
    @Test
    public void whenDiv2On2Then1() {
        Calculator calc2 = new Calculator();
        double result = calc2.div(2D, 2D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

     /**
      * тест метода произведения чисел
      */
    @Test
    public void whenMultiple2On2Then4() {
        Calculator calc3 = new Calculator();
        double result = calc3.multiple(2D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));
    }
}