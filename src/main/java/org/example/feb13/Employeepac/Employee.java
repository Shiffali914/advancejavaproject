package org.example.feb13.Employeepac;

import lombok.*;


@Getter
@Setter
@ToString
@AllArgsConstructor

public class Employee implements Empsalary,Employeee {

    public int empId;
    public String firstName;
    public String lastName;
    public  int salary;


    @Override
    public int apply(Employee emp) {
        return 0;
    }

    @Override
    public Employee get() {
        return null;
    }

    }

