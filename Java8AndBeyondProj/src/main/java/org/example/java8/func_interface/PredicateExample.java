package org.example.java8.func_interface;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {
    private static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
    private static Predicate<Student> p2 = s -> s.getGpa() >= 3.9;
    private static Consumer<Student> c1 = student -> {
        if (p1.and(p2).test(student)) {
            System.out.printf("\nStudent Info :: [{%s}]", student);
        }
    };

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(c1);

    }
}
