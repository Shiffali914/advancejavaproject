package org.example.feb15.Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<Integer> number= Arrays.asList(22,23,55,66,44,77,86);
        Stream<Integer> numberstream = number.stream();
        List<String> collect = numberstream.filter(n -> n % 2 == 0).sorted().map(n -> String.valueOf(n)).map(s -> s + s).collect(Collectors.toList());

        System.out.println(collect);
        // Stream<Integer> integerStream = Stream.of(3, 4, 5, 6, 7, 8);

    }
}
