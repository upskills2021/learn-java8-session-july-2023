package com.app.demo.static_vs_nonstatic;

public class StaticBlockDemo {
    static {
        System.out.println("Inside static block1");
    }
    static {
        System.out.println("Inside static block2");
    }
    static {
        System.out.println("Inside static block3");
    }

    public static void main(String[] args) {
        System.out.println("Inside main method()...");
    }
}
