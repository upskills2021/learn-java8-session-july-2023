package org.example.java8.func_interface;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {
    private static BiPredicate<Integer, Double> p1 = (grade, gpa) -> grade >= 3 && gpa >= 3.9;
    private static Predicate<Student> p2 = (s) -> p1.test(s.getGradeLevel(), s.getGpa());
    private static Consumer<Student> c1 = (s) -> {
        if(p2.test(s)) {
            System.out.println(s);
        }
    };

    public static void main(String[] args) {
        StudentDatabase.getAllStudents().forEach(c1);
    }
}
