package org.example.feb13.Employeepac;
import java.util.Scanner;

public class EmpMain {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the id");
        int Id=sc.nextInt();

        System.out.println("enter the first name");
        String firstname=sc.next();

        System.out.println("enter the last name");
        String lastname=sc.next();

        System.out.println("enter the salary");
        int salary=sc.nextInt();

        Employee emp = new Employee(Id, firstname, lastname, salary);

        Empsalary salary1=(emp1)->{
                return emp.salary;
        };
        System.out.println("Salary of employee is"+salary1.apply(emp));

        Employeee object=()-> {
            return emp;
        };
        System.out.println("Detail of employee"+" "+object.get());
    }
}
