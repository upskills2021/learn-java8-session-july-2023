package org.example.java8.termnaloperation;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxByMinByExample {
    public static void main(String[] args) {
        Optional<Student> optionalStudent = findByHighestGpa(StudentDatabase.getAllStudents());
        optionalStudent.ifPresent(System.out::println);
        optionalStudent = findByLowestGpa(StudentDatabase.getAllStudents());
        optionalStudent.ifPresent(System.out::println);
    }

    private static Optional<Student> findByHighestGpa(List<Student> students) {
        // return students.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
        return students.stream().max(Comparator.comparing(Student::getGpa));
    }
    private static Optional<Student> findByLowestGpa(List<Student> students) {
        // return students.stream().collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
        return students.stream().min(Comparator.comparing(Student::getGpa));
    }
}
