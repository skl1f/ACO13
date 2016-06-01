package student;

import utils.MyDate;


/**
 * Created by gorobec on 22.05.16.
 */
public class Student implements Comparable{

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

    public int compareTo(Student student) {
        return getName().compareTo(student.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(student.getAverageMark(), getAverageMark()) != 0) return false;
        if (getGender() != student.getGender()) return false;
        if (!getName().equals(student.getName())) return false;
        return getBirthDay().equals(student.getBirthDay());

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        result = 31 * result + getBirthDay().hashCode();
        temp = Double.doubleToLongBits(getAverageMark());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) getGender();
        return result;
    }

    @Override
    public String toString(){
        return String.format("%2$s, BD - %1$s, average mark - %3$.1f",  birthDay.asString(), name, averageMark);
    }

    @Override
    public int compareTo(Object o) {
        return getName().compareTo(((Student) o).getName());
    }
}
