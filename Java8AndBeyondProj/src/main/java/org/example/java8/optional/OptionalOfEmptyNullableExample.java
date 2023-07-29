package org.example.java8.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){

       return  Optional.ofNullable(null);

    }

    public static Optional<String> of(){

        return  Optional.of(null);
       // return  Optional.of(null);

    }

    public static Optional<String> empty(){

        return  Optional.empty();
        // return  Optional.of(null);

    }
    public static void main(String[] args) {

        Optional<String> optionalString = ofNullable();
        optionalString.ifPresent(System.out::println);
        optionalString = of();
        optionalString.ifPresent(System.out::println);
    }
}
