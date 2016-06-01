package student;

import utils.MyArrayList;
/**
 * Created by gorobec on 22.05.16.
 */
public class Group{
    private String name;
    private MyArrayList students;

    public Group(String name) {
        this.name = name;
        this.students = new MyArrayList();
    }

    public Group(String name, Student[] students) {
        this.name = name;
        this.addStudent(students);
    }

    public int size() {
        return students.size();
    }


    public boolean addStudent(Student student) {
        if (student == null) return false;

        if (contains(student)) return false;

        students.add(student);
        return true;
    }

    public boolean addStudent(Student[] students) {
        for (Student s: students) {
//            return false, as you want
            if(!addStudent(s)) return false;
        }
        return true;
    }

    public void showGroup() {
        System.out.println(students);
    }

    public boolean contains(Student student) {
        return students.contains(student);
    }

    public boolean delStudent(Student student) {
        if (student == null) return false;
        if (students.contains(student)) {
                students.remove(student);
                return true;
            }
        return false;
    }

    public void sort() {
        students.sort();
    }
}
