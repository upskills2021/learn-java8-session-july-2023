package org.example.java8;

public class FuncProgExample {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable1...");
            }
        };
        Thread t1 = new Thread(runnable1);
        t1.start();

        Runnable runnable2 = () -> {
            System.out.println("Inside Runnable2");
        };
        Thread t2 = new Thread(runnable2);
        t2.start();
    }
}
