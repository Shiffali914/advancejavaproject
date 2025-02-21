package org.example.feb18;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) {

        List<Employees> employees= Arrays.asList(

                Employees.builder()
                        .fName("Karan")
                        .lName("B")
                        .Salary(100000)
                        .Gender("M")
                        .addresses(Arrays.asList(Address.builder().postalcode("L7G 0L1").city("Georgetown").build(),
                                Address.builder().postalcode("L7G 0L1").city("Georgetown").build()))
                        .build(),

                Employees.builder()
                        .fName("Rachna")
                        .lName("M")
                        .Salary(115000)
                        .Gender("F")
                        .addresses(Arrays.asList(Address.builder().postalcode("D4E5F6").city("Toronto").build(),
                                Address.builder().postalcode("L7G 0L1").city("Georgetown").build()))
                        .build(),

                Employees.builder()
                        .fName("Chris")
                        .lName("S")
                        .Salary(120000)
                        .Gender("M")
                        .addresses(Arrays.asList(Address.builder().postalcode("J3K5L6").city("Mississagua").build(),
                                Address.builder().postalcode("L7G 0L1").city("Georgetown").build()))
                        .build()

               /* Employees.builder()
                        .fName("Sahil")
                        .lName("P")
                        .Salary(125000)
                        .Gender("M")
                        .build()*/

        );



       // System.out.println(employees.stream().filter(e -> e.getSalary() > 117000).collect(Collectors.toList()));
        Integer sum = employees.stream().map(e -> e.getSalary()).reduce(0, (a, b) -> a + b);
        System.out.println(sum);

     //  System.out.println(employees.stream().sorted((a, b) -> b.getFName().compareTo(a.getFName())).peek(x-> System.out.println(x)).collect(Collectors.toList()));
        /*List<Employees> skip = employees.stream().limit(3).collect(Collectors.toList());
        System.out.println(skip);*/

        // System.out.println(employees.stream().peek(x -> System.out.println(x)).collect(Collectors.toList()));

      /*  Employees employees1 = employees.stream().min((a, b) -> a.getSalary() - b.getSalary()).get();
        System.out.println(employees1);
        System.out.println(employees.stream().count());*/


       /*Optional<Employees>listemp= employees.stream().findAny();
       listemp.ifPresent(System.out::println);*/

        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employees::getGender, Collectors.counting()));
        System.out.println(collect);




        //flatmap is used to flatten the stream means one at the base level we can get the stream out of its collection
        // but there is layer in collections but if one particular collection in another collection

         employees.stream().flatMap(e -> e.getAddresses().stream()).forEach(a-> System.out.println(a));
        System.out.println(employees.stream().flatMap(a -> a.getAddresses().stream()).map(a -> a.getPostalcode()).collect(Collectors.toList()));

    }
}
