package org.example.java8.func_interface;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {
    private static BiConsumer<String, List<String>> c1 = (name, activities) -> System.out.println(name + " :: " + activities);
    private static Consumer<Student> c2 = student -> c1.accept(student.getName(), student.getActivities());

    public static void main(String[] args) {
        StudentDatabase.getAllStudents().forEach(c2);
    }
}
