package student;

import java.util.Comparator;

/**
 * Created by skl1f on 6/1/2016.
 */
public class GroupByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
    }
}
