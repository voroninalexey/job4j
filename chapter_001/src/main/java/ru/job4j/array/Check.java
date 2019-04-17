package ru.job4j.array;
/**
 *@author Alex Voronin
 *@since 17.04.2019
 *@version 1
 */
public class Check {
    /**
     * метод определяет, что все элементы в массиве являются true или false.
     * @param data массив
     * @return да либо нет
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
         for (int index = 1; index != data.length; index++) {
            if (data[0] != data[index]) {
                result = false;

             }
         }
        return result;
    }
}
