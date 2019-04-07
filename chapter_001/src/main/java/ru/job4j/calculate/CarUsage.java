package ru.job4j.calculate;

/**
 * CarUsage класс для определения возможного пробега машины
 * @author AlexVoronin
 * @since 05.04.2019
 * @version 1
 */
public class CarUsage {
    /**
     * Конструктор позволяющий определить сколько машина сможет проехать
     * @param args args
     */
    public static void main(String[]args) {
        Car audi = new Car();
        /*driving булева переменная показывает сможет машина ехать или нет
         */
        boolean driving = audi.canDrive();
        /*вывод на консоль
         */
        System.out.println("Can you drive?:" + driving);
        System.out.println("I am going to a gas station.");
        /*gas переменная показывает кол-во топлива в баке
         */
        int gas = 25;

        /* метод определяет пробег машины после заправки
         */

        audi.fill(gas);
        driving = audi.canDrive();

        /* вывод на консоль*/
        System.out.println("You can drive now?:" + driving);
        System.out.println("Now.I am going to my granny.");
        System.out.println("It's 10 km from here.");

        /* переменная distance показывает пробег после заправки*/
        int distance = 10;

        /* метод определяющий оставшийся пробег
        * @param distance пробег
         */
        audi.drive(distance);
        /*метод выводит оставшийся пробег на консоль*/
        audi.gasInfo();
    }


}
