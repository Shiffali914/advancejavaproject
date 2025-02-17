package org.example.feb15.supplier;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {

        student student1= student.builder().fName("shiffali").lName("bansal").build();

        StudentDetail studentDetail=new StudentDetail();
        Supplier<student> supplier=()-> student1;
        student printdetail = studentDetail.printdetail(supplier);
        System.out.println(printdetail);


    }
}
