package ru.job4j.condition;

/** Программа определяет может ли Стив работать водителем.
 * @author AlexVoronin
 * @since 10.04.2019
 * @version 1
 */

public class TruckerJob {
    /**Метод определяет кем работает Стив в зависимости наличия водительских прав и категории
     *
     * @param args args
     */
    public static void main(String[]args) {
        Driver steve = new Driver();
        System.out.println("Steve wants the trucker job.");

        if (!steve.hasLicense()) {
            System.out.println("Steve need to get a license!");
            steve.passExamOn('A');
        }
        if (steve.canDrive('C')) {
            System.out.println("Steve works on truckers!");
        } else if (steve.canDrive('B')) {
            System.out.println("Steve works in taxi.");
        } else {
            System.out.println("Steve does not have a job, but ride on motorbike!");
        }
    }
}
