package org.example.java8.numericstreams;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentsMapper {
    public static void main(String[] args) {
        List<Student> students = mapIdsToStudents(List.of(1,2,3,4,0));
        System.out.println("Find By IDS");
        students.forEach(System.out::println);

        List<Double> gpaList = List.of(3.5, 3.9, 3.8);
        students = mapGPAToStudents(gpaList);
        System.out.println("Find By GPAs");
        students.forEach(System.out::println);

        students = mapGradesToStudents(List.of(1,2,3,4));
        System.out.println("Find By Grades");
        students.forEach(System.out::println);
    }

    private static List<Student> mapIdsToStudents(List<Integer> studentIds) {
        // Integer i = new Integer(1);
        // int i = 1;
        // Integer integerObj = i; // boxing  -> converting from primitive to wrapper class object
        // int j = integerObj; // unboxing -> converting from wrapper class object to primitive variable
        // Integer intObj = Integer.valueOf(1); -> (Integer intObj = new Integer(1);) -> converting from primitive to wrapper class object
        // int i = intObj.intValue(); -> converting from wrapper class object to primitive variable
        // mapToInt(...) -> convert Stream<Integer> to IntStream object
        // mapToInt(Integer::valueOf) -> create IntStream object and inside that element is Integer wrapper class object
        // mapToInt(Integer::intValue) -> create IntStream object and inside that element is primitive

        return studentIds
                .stream()
                .mapToInt(Integer::valueOf) //
                //.mapToInt(Integer::intValue)
                .mapToObj(StudentsMapper::findById)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
    private static List<Student> mapGPAToStudents(List<Double> gpaList) {
        return gpaList
                .stream()
                .mapToDouble(Double::doubleValue)
                .mapToObj(StudentsMapper::findByGpa)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
    private static List<Student> mapGradesToStudents(List<Integer> grades) {
        return grades
                .stream()
                .mapToInt(Integer::intValue)
                .mapToObj(StudentsMapper::findByGrade)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    private static Student findById(Integer id) {
        List<Student> students = StudentDatabase.getAllStudents();
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    private static List<Student> findByGpa(double gpa) {
        List<Student> students = StudentDatabase.getAllStudents();
        return students.stream()
                .filter(student -> student.getGpa() == gpa)
                .collect(Collectors.toList());
    }
    private static List<Student> findByGrade(int gradeLevel) {
        List<Student> students = StudentDatabase.getAllStudents();
        return students.stream()
                .filter(student -> student.getGradeLevel() == gradeLevel)
                .collect(Collectors.toList());
    }
}
