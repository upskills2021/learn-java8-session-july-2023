package org.example.java8.termnaloperation;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingExample {
    public static void main(String[] args) {
        List<String> studentNames = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println(studentNames);
    }
}
