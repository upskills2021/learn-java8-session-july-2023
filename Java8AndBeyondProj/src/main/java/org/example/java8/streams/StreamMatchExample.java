package org.example.java8.streams;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.List;

public class StreamMatchExample {
    public static void main(String[] args) {
        System.out.println(anyMatch(StudentDatabase.getAllStudents()));
        System.out.println(allMatch(StudentDatabase.getAllStudents()));
        System.out.println(noneMatch(StudentDatabase.getAllStudents()));
    }
    private static boolean anyMatch(List<Student> students) {
        return students.stream().anyMatch(student -> student.getGpa() >= 3.9);
    }
    private static boolean allMatch(List<Student> students) {
        return students.stream().allMatch(student -> student.getGpa() >= 3.9);
    }
    private static boolean noneMatch(List<Student> students) {
        return students.stream().noneMatch(student -> student.getGpa() > 4.0);
    }
}
