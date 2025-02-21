package org.example.practicefunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrderMain {
    public static void main(String[] args) {
        List<Order>orders= Arrays.asList(Order.builder()
                                        .items(Arrays.asList(Items.builder().name("Laptop").build()))
                                         .build(),

                                         Order.builder()
                                         .items(Arrays.asList(Items.builder().name("Phone").build()))
                                                 .build(),

                                            Order.builder().items(Arrays.asList(Items.builder().name("Calculator").build()))
                                                    .build());

        //FLAT MAP

        System.out.println(orders.stream().flatMap(o -> o.getItems().stream()).map(i->i.getName()).collect(Collectors.toList()));
    }
}
