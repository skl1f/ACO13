package student;

import utils.MyDate;

import java.util.Comparator;

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
        Student st3 = new Student("Alex1",
                new MyDate(1989, 12, 12),
                'M');

        Student st4 = new Student("Jack1",
                new MyDate(1989, 3, 13),
                'M');
        aco13.addStudent(new Student[]{st3, st4});
        aco13.showGroup();
        System.out.println("--------------");

        aco13.sort(new GroupByName());

        aco13.showGroup();
    }

}
