package org.example.feb15.AtomicReferencee;

import java.util.function.Function;

public class EmployeeServices {

    public void printSalary(CompanyEmployee employee, Function<CompanyEmployee,Integer> function)
    {
        System.out.println(function.apply(employee));

    }


}
