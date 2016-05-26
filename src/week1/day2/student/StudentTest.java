package week1.day2.student;

import utils.MyDate;

/**
 * Created by gorobec on 22.05.16.
 */
public class StudentTest {
    public static void main(String[] args){

        Student st1 = new Student("Alex",
                new MyDate(1989, 12, 12),
                'M');

        Student st2 = new Student("Jack",
                new MyDate(1989, 3, 13),
                'M');


        Group aco13 = new Group("ACO13");

        aco13.addStudent(st1);
        aco13.addStudent(st2);

        aco13.showGroup();

        System.out.println("--------------");

        Student alex = aco13.search("Alex");

        System.out.println(alex.asString());

        aco13.delStudent(alex);
        System.out.println("--------------");
        aco13.showGroup();
        alex = aco13.search("Alex");

        System.out.println(alex == null);

        System.out.println("--------------");
        aco13.addStudent(new Student[]{st1, st2});
        aco13.showGroup();
        System.out.println("--------------");

        aco13.sort();

        aco13.showGroup();
    }

}
