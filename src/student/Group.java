package student;

import utils.MyArrayList;

import java.util.Comparator;

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

    @Override
    public String toString() {
        return students.toString();
    }

    public boolean contains(Student student) {
        return students.contains(student);
    }

    public boolean delStudent(Student student) {
//        if you used JDKs ArrayList you even could don't write this line
        if (student == null) return false;
//        KISS
       /* if (students.contains(student)) {
                students.remove(student);
                return true;
            }
        return false;*/
        return students.remove(student);
    }

    public void sort() {
        students.sort();
    }

    public void sort(Comparator comparator) {
        int border = this.size() - 1;
        for (int i = 0; i < border; i++) {
            for (int j = i + 1; j <= border; j++) {
                if (comparator.compare(students.get(i), students.get(j)) > 0) {
                    students.swap(i, j);
                }
            }
        }
    }
}
