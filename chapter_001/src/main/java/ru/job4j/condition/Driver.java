package ru.job4j.condition;

/** Класс для определения наличия водительских прав, возможности работать водителем
 * @author Alexvoronin
 * @since 10.04.2019
 * @version 1
 */
public class Driver {
    private char license = 'N';

    public void passExamOn(char category) {
        this.license = category;
    }
    public boolean hasLicense() {
        return this.license == 'A' || this.license == 'B' || this.license == 'C';
            }
            public boolean canDrive(char category) {
        return this.license == category;
            }
}
