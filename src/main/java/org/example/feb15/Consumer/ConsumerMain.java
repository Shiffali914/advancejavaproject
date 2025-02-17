package org.example.feb15.Consumer;

import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {

        ConsumerExample consumerExample=new ConsumerExample();

        Employed employed1= Employed.builder().fName("Gagan").lName("chaudhary").build();
        Employed employed2=Employed.builder().fName("shiffali").lName("Bansal").build();

        Consumer<Employed> consumer=(employee) -> System.out.println(employee.getFName());

        consumerExample.printdetail(employed1,consumer);
    }
}
