package student.comp;

import student.Student;

import java.util.Comparator;

/**
 * Created by skl1f on 6/1/2016.
 */
public class GroupByAvgMark implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o2.getAverageMark() - o1.getAverageMark());
    }
}
