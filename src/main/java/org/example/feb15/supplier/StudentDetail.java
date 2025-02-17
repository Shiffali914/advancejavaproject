package org.example.feb15.supplier;

import java.util.function.Supplier;

public class StudentDetail {

    public student printdetail(Supplier<student>supplier){
        return supplier.get();
    }
}
