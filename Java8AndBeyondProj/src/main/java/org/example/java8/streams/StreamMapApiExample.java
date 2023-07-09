package org.example.java8.streams;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapApiExample {
    public static void main(String[] args) {
        List<String> studentNames = StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(studentNames);
    }
}
