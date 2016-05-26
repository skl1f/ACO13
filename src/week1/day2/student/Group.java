package week1.day2.student;

/**
 * Created by gorobec on 22.05.16.
 */
public class Group {
    // too small
    private static final int DEFAULT_GROUP_SIZE = 10;
    private int counter;
    private String name;
    private Student[] students;

    public Group(String name) {
        this.name = name;
        this.students = new Student[DEFAULT_GROUP_SIZE];
    }

    public Group(String name, int groupSize) {
        this.name = name;
        this.students = new Student[groupSize];
    }

    public Group(String name, Student[] students) {
        this.name = name;
        this.addStudent(students);
    }

    public int size() {
        return students.length;
    }

    public int freePlaces() {
        return this.size() - counter;
    }

    private void extend() {
        int extendTo = this.size() * 2;
        Student[] studentsExtended = new Student[extendTo];
        System.arraycopy(students, 0, studentsExtended, 0, this.size());
        students = studentsExtended;
    }

    public boolean addStudent(Student student) {
        if (student == null) return false;

        if (contains(student.getName())) return false;
//      first check if present than extend
        if (this.freePlaces() == 0) this.extend();

        students[freePlace()] = student;
        counter++;
        return true;
    }

    public boolean addStudent(Student[] students) {
        for (Student s: students) {
//            return false, as you want
            if(!addStudent(s)) return false;
        }
        return true;
    }

    private int freePlace() {
        for (int i = 0; i < this.size(); i++) {
            if (students[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void showGroup() {
//        KISS
        for (int i = 0; i < this.size(); i++) {
            if (students[i] != null) {
                System.out.println(students[i].asString());
            }
        }
    }

    public boolean contains(String name) {
        if (name == null) return false;
        for (Student s : students) {
            if (s != null && s.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean delStudent(Student student) {
        if (student == null) return false;
        for (int i = 0; i < students.length; i++) {
//            KISS
            if (students[i] != null && students[i].getName().equals(student.getName())) {
                students[i] = null;
                counter--;
                return true;
            }
        }
        return false;
    }

    private void swapStudents(int srcIndex, int dstIndex) {
        Student tmp = students[srcIndex];
        students[srcIndex] = students[dstIndex];
        students[dstIndex] = tmp;
    }

    public void sort() {
        int border = this.size() - 1;
        for (int i = 0; i < border; i++) {
            if (students[i] == null) {continue;}
            for (int j = i + 1; j <= border; j++) {
                if (students[j] == null) {continue;}
                if (students[i].getName().compareTo(students[j].getName()) > 0) {
                    swapStudents(i, j);
                }
            }
        }
    }
}
