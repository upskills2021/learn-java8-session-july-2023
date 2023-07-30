package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {
    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;

    public BusinessService(SortAlgorithm bubbleSortAlgorithm) {
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }

    public void apply(List<Integer> numbers) {
        bubbleSortAlgorithm.sortNumbers(numbers);
        numbers.forEach(System.out::println);
    }
}
