package com.app.demo;
// Access Modifier/Specifier: public,private,default,protected
public class TestStudent {
    public static String DOMAIN_NAME; // static variable
    //Define properties
    private int id; // Instance Variable
    private String name;
    private double gpa;

    public TestStudent(int id, String name, double gpa) {
        System.out.println("Inside Student Parameterized Constructor");
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public TestStudent(){
        System.out.println("Inside Student No Argument Constructor");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static void initData() {
        System.out.println("Init Data");
        DOMAIN_NAME = "IT";
    }
}
