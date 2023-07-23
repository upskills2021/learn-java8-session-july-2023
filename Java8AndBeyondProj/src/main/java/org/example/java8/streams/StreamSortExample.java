package org.example.java8.streams;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamSortExample {
    public static void main(String[] args) {
        Consumer<Student> studentConsumer = System.out::println;
        sortStudentsByName().forEach(studentConsumer);
    }

    private static List<Student> sortStudentsByName() {
        return StudentDatabase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGradeLevel)
                        .thenComparing(Student::getId, Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }
}
