package org.example.java8.termnaloperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 1, 4, 2, 5);
        System.out.println(findDuplicateCount(numbers));
        System.out.println(findDuplicateElement(numbers));
    }
    private static Map<Integer, Long> findDuplicateCount(List<Integer> numbers) {
       return numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
    private static Set<Integer> findDuplicateElement(List<Integer> numbers) {
        return numbers
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}
