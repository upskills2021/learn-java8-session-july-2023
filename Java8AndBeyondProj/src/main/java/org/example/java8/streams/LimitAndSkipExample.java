package org.example.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkipExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        System.out.println(limit(numbers, 2));
        System.out.println(skip(numbers, 2));
    }

    private static List<Integer> limit(List<Integer> integers, long limitValue) {
        return integers.stream().limit(limitValue).collect(Collectors.toList());
    }
    private static List<Integer> skip(List<Integer> integers, long skipValue) {
        return integers.stream().skip(skipValue).collect(Collectors.toList());
    }
}
