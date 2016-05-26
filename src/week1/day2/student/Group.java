package week1.day2.student;

/**
 * Created by gorobec on 22.05.16.
 */
public class Group {
    private static final int GROUP_SIZE = 20;
    private int counter;
    private String name;
    private Student[] students;

    public Group(String name) {
        this.name = name;
        this.students = new Student[GROUP_SIZE];
    }

    public Group(String name, int groupSize) {
        this.name = name;
        this.students = new Student[groupSize];
    }

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public boolean addStudent(Student student) {
        if (student == null) return false;
        if (counter >= students.length) return false;

//               todo check if already present in group
        if ((this.search(student.getName())) != null) {
            return false;
        }

        students[counter] = student;
        counter++;
        return true;
    }

    public void showGroup() {
        for (int i = 0; i < counter; i++) {
            System.out.println(students[i].asString());
        }
    }

    public Student search(String name) {
        if (name == null) return null;

        for (Student s : students) {
            if (s == null) {
                continue;
            } else if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public boolean delStudent(Student student) {
        if (student == null) return false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            } else if (students[i].getName().equals(student.getName())) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }


}
