package org.example.java8.method_ref;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodRefExample {
    public static void main(String[] args) {
        Function<String, String> toUppercase = String::toUpperCase;
        String strUppercase = toUppercase.apply("java");
        System.out.println(strUppercase);
        Predicate<Student> predicate = MethodRefExample::greaterThan;
        //Display student activities
        Consumer<Student> studentConsumer = Student::displayActivities;
        StudentDatabase.getAllStudents().forEach(studentConsumer);
    }

    private static boolean greaterThan(Student student) {
        return student.getGradeLevel() > 3;
    }

}
