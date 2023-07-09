package org.example.java8.streams;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilerExample {
    public static void main(String[] args) {
        //Filter students where grade > 3 and gpa >= 3.9

        Predicate<? super Student> studentPredicate = (student) -> student.getGradeLevel() > 3 && student.getGpa() >= 3.9;
        List<Student> students = StudentDatabase.getAllStudents()
                .stream()
                .filter(studentPredicate)
                .collect(Collectors.toList());
        Consumer<Student> c1 = System.out::println;
        students.forEach(c1);
    }
}
