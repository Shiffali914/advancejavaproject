package org.example.practicefunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList= Arrays.asList(
                                                Person.builder().name("shiffali").city("georgetown").build(),
                                                Person.builder().name("Aman").city("Mississagua").build(),
                                                Person.builder().name("Paramjeet").city("georgetown").build()
        );

        Map<String, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(Person::getCity));
        System.out.println(collect);

    }
}
