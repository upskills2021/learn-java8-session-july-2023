package org.example.java8.numericstreams;

import org.example.java8.data.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamExample {
    public static void main(String[] args) {
//        System.out.println("Sum is :: " + sum(List.of(1,2,3,4,5)));
//        System.out.println("Sum is :: " + sum());
//        numericStreamExamples();
        boxing();
    }
    private static void numericStreamExamples() {
        var intStream = IntStream.range(1,5);
        //System.out.println(intStream.count());
        intStream.forEach(value -> System.out.println(value + ","));
        intStream = IntStream.rangeClosed(1,5);
        //System.out.println(intStream.count());
        System.out.println("--------------------");
        intStream.forEach(value -> System.out.println(value + ","));

    }
    private static int sum(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }
    private static int sum() {
        return IntStream.rangeClosed(1,5).sum();
    }

    private static void boxing() {
        List<Integer> numbers = IntStream.rangeClosed(1,5)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("After Boxing :: " + numbers);
        unBoxing(numbers);
    }
    private static void unBoxing(List<Integer> integerList) {
        int sum = integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of numbers :: " + sum);
    }
}
