package org.example.java8.data;

import java.util.List;

public class StudentEqualsAndHashCodeExample {
    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        Student student1 = studentList.get(0);
        Student student2 = studentList.get(1);
        System.out.println("Student1 hashCode() :: " + student1.hashCode());
        System.out.println("Student2 hashCode() :: " + student2.hashCode());
        System.out.println("Student1.equals(Student2) :: " + student1.equals(student2));
    }
}
