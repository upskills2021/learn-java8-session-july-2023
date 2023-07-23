package org.example.java8.streams;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
    public static void main(String[] args) {
        Optional<Student> optionalStudent = findStudentByFindFirst();
        optionalStudent.ifPresent(System.out::println);
        Optional<Student> optionalStudent1 = findStudentByFindAny();
        optionalStudent1.ifPresent(System.out::println);
    }

    private static Optional<Student> findStudentByFindFirst() {
        return StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() > 3.8)
                .findFirst();
    }
    private static Optional<Student> findStudentByFindAny() {
        return StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() > 3.8)
                .findAny();
    }
}
