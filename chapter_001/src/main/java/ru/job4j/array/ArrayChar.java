package ru.job4j.array;
/**
 *@author Alex Voronin
 *@since 17.04.2019
 *@version 1
 */
public class ArrayChar {
    private final char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /**
     * Проверяет, что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        // проверить, что массив data имеет первые элементы, одинаковые с value
        for (int index = 0; index < value.length; index++) {
             if (data[index] != value[index]) {
                 result = false;
                 break;
             }
            }
        return result;
    }
}
