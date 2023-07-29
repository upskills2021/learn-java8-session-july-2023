package org.example.java8.optional;

import org.example.java8.data.Bike;
import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    public static void optionalFlatMap(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDatabase.getStudentSupplier().get());
        Optional<Bike> optionalBike = optionalStudent.flatMap(Student::getOptionalBike);
        optionalBike.ifPresent(System.out::println);
    }
    private static void optionalMap() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDatabase.getStudentSupplier().get());
        Optional<String> optionalStudentName = optionalStudent.map(Student::getName);
        optionalStudentName.ifPresent(System.out::println);
    }
    private static void optionalFilter() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDatabase.getStudentSupplier().get());
        optionalStudent = optionalStudent.filter(student -> student.getGpa() > 3.8);
        if(optionalStudent.isEmpty()) {
            System.out.println("Student Not Found...");
        }
        optionalStudent.ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        optionalFlatMap();
        optionalMap();
        optionalFilter();
    }
}
