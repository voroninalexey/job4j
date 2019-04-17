package ru.job4j.array;
/**
 *@author Alex Voronin
 *@since 17.04.2019
 *@version 1
 */
public class Turn {
    /**
     * метод переворачивает массив задом наперед
     * @param array массив
     * @return перевернутый массив
     */
    public int[] back(int[] array) {
        int temp = array[0];
            for (int index = 0; index < array.length / 2; index++) {
                array[index] = array [array.length - 1 - index];
                array [array.length - 1 - index] = temp;
                temp = array [index + 1];
            }
            return array;
    }
}
