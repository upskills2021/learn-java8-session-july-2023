package org.example.java8.streams;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        List<String> activities = StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(activities);
        long count = StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(Collection::stream)
                .distinct()
                .count();
        System.out.println("Total activities performed by students :: " + count);
    }
}
