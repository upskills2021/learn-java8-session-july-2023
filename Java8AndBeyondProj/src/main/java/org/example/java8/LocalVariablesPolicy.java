package org.example.java8;

import java.util.function.Consumer;

public class LocalVariablesPolicy {
    public static void main(String[] args) {
        final int i = 0;
        Consumer<Integer> c1 = (a) -> {
            System.out.println("Value of i :: " + i);
        };
    }
}
