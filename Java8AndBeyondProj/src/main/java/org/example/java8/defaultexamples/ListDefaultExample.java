package org.example.java8.defaultexamples;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;

public class ListDefaultExample {
    private static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    private static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);

    public static void main(String[] args) {
        List<Student> allStudents = StudentDatabase.getAllStudents();
        allStudents.sort(nameComparator.thenComparing(gpaComparator));
        System.out.println(allStudents);
    }

}
