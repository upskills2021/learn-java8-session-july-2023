package org.example.java8.streams;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamSortExample {
    public static void main(String[] args) {
        Consumer<Student> studentConsumer = (s) -> System.out.println(s);
        sortStudentsByName().forEach(studentConsumer);
    }

    private static List<Student> sortStudentsByName() {
        return StudentDatabase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGradeLevel).reversed()
                        .thenComparing(Student::getId))
                .collect(Collectors.toList());
    }
}
