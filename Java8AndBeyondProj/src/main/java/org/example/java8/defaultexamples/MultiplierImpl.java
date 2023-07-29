package org.example.java8.defaultexamples;

import java.util.List;

public class MultiplierImpl implements Task {
    @Override
    public int performTask(List<Integer> numbers) {
            return numbers
                    .stream()
                    .mapToInt(Integer::intValue)
                    .reduce(1, (x, y) -> x * y);
    }
}
