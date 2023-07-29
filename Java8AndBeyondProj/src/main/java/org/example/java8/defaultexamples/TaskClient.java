package org.example.java8.defaultexamples;

import java.util.List;

public class TaskClient {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        Executor.perform(Activity.SUM, numbers);
        Executor.perform(Activity.MULTIPLY, numbers);
    }
}
