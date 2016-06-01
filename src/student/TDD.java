package student;

import utils.MyDate;

/**
 * Created by gorobec on 22.05.16.
 */
public class TDD {
    public static void main(String[] args) {

        Group group = new Group("ACO");

        Student st1 = new Student("Alex",
                new MyDate(1989, 12, 12),
                'M');

        boolean expected = true;
        boolean actual = group.addStudent(st1);

        System.out.printf("Method name - %s, result - %s," +
                " expected - %s, actual - %s\n", "addStudent"
                , expected == actual, expected, actual);

        boolean expected1 = true;
        boolean actual1 = group.delStudent(st1);

        System.out.printf("Method name - %s, result - %s," +
                " expected - %s, actual - %s\n", "delStudent"
                , expected1 == actual1, expected1, actual1);





    }
}
