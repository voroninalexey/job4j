package ru.job4j.calculate;

/**Car класс для определения пробега машины
 * @author alexVoronin
 * @since 05.04.2019
 * @version 1
  */

public class Car {
    private double volume;
    boolean result;
    /**drive метод определяет оставшийся пробег машины
     * @param kilometer пробег
     */

    public void drive(int kilometer) {
        this.volume = this.volume - kilometer;
    }
    /**fill метод определяет  пробег машины после заправки
     * @param gas топливо
     */
    public void fill(int gas) {
        this.volume = this.volume + 10 * gas;
    }

    /**
     * метод определяет может машина ехать или нет
     */
    public boolean canDrive() {

        result = this.volume > 0;
        return result;
    }
    /**
     * метод выводит на консоль оставшийся пробег машины
     */
     public void gasInfo() {
        System.out.println("I can drive" + this.volume + "kilometers.");
    }
}
