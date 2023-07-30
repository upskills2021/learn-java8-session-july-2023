package com.springboot.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Qualifier("bubbleSortAlgorithm")
@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public void sortNumbers(List<Integer> numbers) {
        System.out.println("Original List: " + numbers);
        int n = numbers.size();
        //iterate over the array comparing adjacent elements
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                //if elements not in order, swap them
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
        //print the sorted array
        System.out.println("Sorted numbers: " + numbers);
    }
}
