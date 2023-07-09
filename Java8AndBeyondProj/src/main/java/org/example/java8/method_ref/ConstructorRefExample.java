package org.example.java8.method_ref;

import org.example.java8.data.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class ConstructorRefExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier1 = Student::new;
        Supplier<Student> studentSupplier2 = () -> new Student(1,"Adam",2,3.6, "male",10, Arrays.asList("swimming", "basketball","volleyball"));
    }

}
