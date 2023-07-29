package org.example.java8.parallel_stream;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1, 1000)
                .forEach(sum::performSum);
        System.out.println(sum.getTotal());
        sum = new Sum();
        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(sum::performSum);
        System.out.println(sum.getTotal());
    }
}
