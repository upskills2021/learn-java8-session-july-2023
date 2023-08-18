package com.app.demo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestStudent.initData();
        TestStudent student = new TestStudent();
        System.out.println("Student Id :: " + student.getId());
        System.out.println("Student Name :: " + student.getName());
        System.out.println("Student Gpa :: " + student.getGpa());

        TestStudent student1 = new TestStudent(1,"A", 3.5);
        System.out.println("Student Id :: " + student1.getId());
        System.out.println("Student Name :: " + student1.getName());
        System.out.println("Student Gpa :: " + student1.getGpa());

        TestStudent student3 = new TestStudent();
        student3.setId(3);
        student3.setName("B");
        student3.setGpa(3.5);
        System.out.println("Student Id :: " + student3.getId());
        System.out.println("Student Name :: " + student3.getName());
        System.out.println("Student Gpa :: " + student3.getGpa());

        String domainName = TestStudent.DOMAIN_NAME;
        System.out.println(" Student.DOMAIN_NAME = " + domainName);

    }
}
