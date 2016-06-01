package week2.day1;

/**
 * Created by skl1f on 5/28/2016.
 */
public class Employee {
    private int age;
    private String name;
    private String surname;

    public Employee(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %s, Surname: %s", name, age, surname);
    }

    public void work() {
        System.out.println("I'm working (Employee)");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



}
