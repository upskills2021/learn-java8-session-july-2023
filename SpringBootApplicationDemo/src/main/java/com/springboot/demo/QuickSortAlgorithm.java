package com.springboot.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Qualifier("quickSortAlgorithm")
@Component
public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public void sortNumbers(List<Integer> numbers) {
        sort(numbers, 0, numbers.size() - 1);
    }

    public static void sort(List<Integer> list, int from, int to) {
        if (from < to) {
            int left = from + 1;
            int right = to;
            int pivotValue = list.get(from);
            while (left <= right) {
                // left <= to -> limit protection
                while (left <= to && pivotValue >= list.get(left)) {
                    left++;
                }
                // right > from -> limit protection
                while (right > from && pivotValue < list.get(right)) {
                    right--;
                }
                if (left < right) {
                    Collections.swap(list, left, right);
                }
            }
            Collections.swap(list, from, left - 1);
            sort(list, from, right - 1); // <-- pivot was wrong!
            sort(list, right + 1, to);   // <-- pivot was wrong!
        }
    }
}
