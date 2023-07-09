package org.example.java8.func_interface;

import org.example.java8.data.Student;

public class IUserOpsLamdaExample {
    public static void main(String[] args) {
        IStudentOps<Student> studentOps = (s)-> System.out.println("Creating a student");

    }
}
