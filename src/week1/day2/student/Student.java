package week1.day2.student;

import utils.MyDate;
/**
 * Created by gorobec on 22.05.16.
 */
public class Student {

    private String name;
    private MyDate birthDay;
    private double averageMark;
    private char gender;

    public Student(String name, MyDate birthDay, char gender) {
        this.birthDay = birthDay;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public MyDate getBirthDay() {
        return birthDay;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public char getGender() {
        return gender;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String asString(){
        return String.format("%2$s, BD - %1$s, average mark - %3$.1f",  birthDay.asString(), name, averageMark);
    }
}
