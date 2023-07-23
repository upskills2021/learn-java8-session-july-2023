package org.example.java8.termnaloperation;

import org.example.java8.data.Student;
import org.example.java8.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.*;

public class StreamsPartitioningExample {

    public static void partitioningBy_1(){

        Predicate<Student> gpaPredicate = (student) -> student.getGpa()>=3.8;

        Map<Boolean,List<Student>> studentMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));

        System.out.println("studentMap : " + studentMap);

    }

    public static void partitioningBy_2(){

        Predicate<Student> gpaPredicate = (student) -> student.getGpa()>=3.8;

        Map<Boolean,Set<Student>> studentMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate,toSet()));

        System.out.println("studentMap : " + studentMap);

    }


    public static void partitioningBy_3(){

        Predicate<Student> gpaPredicate = (student) -> student.getGpa()>=3.8;

        Map<Boolean,Map<Integer, List<String>>> studentMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate,toMap(Student::getId,Student::getActivities)));

        System.out.println("studentMap : " + studentMap);

    }

    public static void main(String[] args) {
        partitioningBy_1();
        partitioningBy_2();
        partitioningBy_3();
    }
}
