package org.example.java8.func_interface;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionExample {
    private static Function<List<Student>, Map<Integer, Map<String, List<String>>>> f1 = (students) -> {
        Map<Integer, Map<String, List<String>>> outerStudentMap = new HashMap<>();
        students.forEach(student -> {
            Map<String, List<String>> studentNestedMap = new HashMap<>();
            studentNestedMap.put(student.getName(), student.getActivities());
            outerStudentMap.put(student.getId(), studentNestedMap);
        });
        return outerStudentMap;
    };
    private static BiConsumer<String, List<String>> c1 = (name, activities) -> System.out.println(name + " :: " + activities);
    private static BiConsumer<? super Integer, ? super Map<String, List<String>>> studentConsumer = (id, activitiesMap) -> {
        System.out.print(id + " :: ");
        activitiesMap.forEach(c1);
    };


    public static void main(String[] args) {
        Supplier<List<Student>> students = StudentDatabase.getStudentsSupplier();
        Map<Integer, Map<String, List<String>>> studentMap = f1.apply(students.get());
        studentMap.forEach(studentConsumer);
        // Convert from studentList to Map<String, List<String>>
        // apply function
    }
}
