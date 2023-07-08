package org.example.java8.func_interface;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Supplier;

public class FunctionExample2 {
    public static void main(String[] args) {
        Supplier<List<Student>> studentsSupplier = StudentDatabase.getStudentsSupplier();
        // API -> Student map where grade > 3 and gpa > 3.9 -> method1 - > function & Predicate
        // return this map -> Map<Integer, Map<String, Map<String, List<String>>>
        // [ID] :: [name] :: [grade] :: [gpa] :: [number of activities] -> method2 -> BiConsumer
    }
}
