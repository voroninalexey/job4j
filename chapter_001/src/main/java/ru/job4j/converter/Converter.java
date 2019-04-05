package ru.job4j.converter;

/**
 * Конвертер валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
       return value/70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары.
     */
    public int rubleToDollar(int value) {
        return value/60;
    }
    /**
     * Конвертируем евро в рубли.
     * @param euro евро.
     * @return рубли.
     */
    public int euroToRuble(int euro) {
        return euro*70;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param doll доллары.
     * @return рубли.
     */
    public int dollarToRuble(int doll) {
        return doll*60;
    }
}