package org.example.feb15.supplier;
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the name");
        String Name=scanner.next();

        System.out.println("enter the surname");
        String surname=scanner.next();

        student student1= student.builder().fName(Name).lName(surname).build();

        StudentDetail studentDetail=new StudentDetail();
        Supplier<student> supplier=()-> student1;
        student printdetail = studentDetail.printdetail(supplier);
        System.out.println(printdetail);


    }
}
