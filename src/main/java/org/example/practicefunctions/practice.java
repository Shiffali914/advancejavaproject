package org.example.practicefunctions;

import java.util.*;
import java.util.stream.Collectors;

public class practice {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,6,7,89,10,11,4,6,7,3);

        //filter
        System.out.println(numbers.stream().filter(e -> e > 5).collect(Collectors.toList()));

        //map
        System.out.println(numbers.stream().map(e -> e*2).collect(Collectors.toList()));

        //Distinct
        Long collect = numbers.stream().distinct().collect(Collectors.counting());
        System.out.println(collect);

        //sort
        System.out.println(numbers.stream().sorted((a, b) -> b - a).peek(x-> System.out.println("peek"+x)).collect(Collectors.toList()));

        //Limit
        List<Integer> newlist = numbers.stream().limit(4).collect(Collectors.toList());
        System.out.println(newlist);

        //skip
        System.out.println(numbers.stream().skip(3).collect(Collectors.toList()));

        //reduce
        Integer reduce = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        //Allmatch
        boolean b = numbers.stream().allMatch(a -> a > 0);
        System.out.println(b);

        //Anymatch
        boolean b1 = numbers.stream().anyMatch(a -> a > 10);
        System.out.println(b1);

        //FindFirst
        Optional<Integer> first = numbers.stream().filter(a->a==5).findFirst();
        System.out.println(first);

        //FindAny
        System.out.println(numbers.stream().findAny().get());
        //System.out.println(any);

        //toArray
        Integer[] array = numbers.stream().toArray(Integer[]::new);
        System.out.println("Array");

        //Partitioning by
        for(Integer i:array)
        {
            System.out.println(i);
        }
        Map<Boolean, List<Integer>> partition = numbers.stream().collect(Collectors.partitioningBy(a -> a % 2 == 0));
        System.out.println(partition);

        //summarizeint
        IntSummaryStatistics summarizielist = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(summarizielist);

    }
}
