package org.example.feb15.Consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public void printdetail(Employed employed, Consumer<Employed>consumer){

        consumer.accept(employed);

    }
}
