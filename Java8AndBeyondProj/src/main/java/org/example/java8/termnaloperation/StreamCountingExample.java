package org.example.java8.termnaloperation;

import org.example.java8.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamCountingExample {
    public static void main(String[] args) {
        long count = StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel() == 4)
                .collect(Collectors.counting());
        System.out.println(count);
    }
}
