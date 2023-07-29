package org.example.java8.optional;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.Optional;

public class OptionalExample {
    private static Optional<Student>  getOptionalStudent() {
     return Optional.ofNullable(StudentDatabase.getStudentSupplier().get());

    }
    public static void main(String[] args) {
        Optional<Student> optionalStudent = getOptionalStudent();
        if(optionalStudent.isEmpty()) {
            System.out.println("Student is not found");
        }
        optionalStudent.ifPresent(student -> System.out.println("Student Data :: " + student));
     }
}
