package utils;

/**
 * Created by gorobec on 22.05.16.
 */
public class MyDate {
    private int yearBirth;
    private int monthBirth;
    private int dayBirth;

    public MyDate(int yearBirth, int monthBirth, int dayBirth) {
        this.yearBirth = yearBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
    }

    public String asString(){
        return String.format("%d.%d.%d", dayBirth, monthBirth, yearBirth);
    }
}
