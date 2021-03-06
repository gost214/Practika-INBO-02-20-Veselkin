package pract9;

import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().hashCode() - o2.getName().hashCode();
    }
}