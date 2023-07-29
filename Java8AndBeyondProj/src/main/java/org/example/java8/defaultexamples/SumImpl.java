package org.example.java8.defaultexamples;

import java.util.List;

public class SumImpl implements Task {
    @Override
    public int performTask(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::valueOf).sum();
    }
}
