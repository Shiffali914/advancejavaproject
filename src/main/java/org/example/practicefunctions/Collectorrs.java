package org.example.practicefunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectorrs {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple","Banana","Cherry");
        System.out.println(fruits.stream().collect(Collectors.joining(",","[","]")));

        System.out.println(fruits.stream().collect(Collectors.mapping(String::length, Collectors.toList())));




    }
}
