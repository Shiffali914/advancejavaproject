package org.example.feb15.Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<Integer> number= Arrays.asList(22,23,55,66,44,77,86);
        Stream<Integer> numberstream = number.stream();
        numberstream.filter(n-> n%2==0).sorted().forEach(n-> System.out.println(n));

      // Stream<Integer> integerStream = Stream.of(3, 4, 5, 6, 7, 8);

    }
}
