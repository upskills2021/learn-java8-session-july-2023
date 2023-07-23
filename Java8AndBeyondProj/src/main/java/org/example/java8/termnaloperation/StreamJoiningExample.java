package org.example.java8.termnaloperation;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamJoiningExample {
    public static void main(String[] args) {
        System.out.println("Output of joining() :: " + joining());
        System.out.println("Output of joining() :: " + joiningWithDelimiter());
        System.out.println("Output of joining() :: " + joiningWithDelimiterAndSufixAndPrefix());
    }
    private static String joining() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }
    private static String joiningWithDelimiter() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }
    private static String joiningWithDelimiterAndSufixAndPrefix() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("||", "[","]"));
    }
}
