package org.example.feb15.AtomicReferencee;

import java.util.concurrent.atomic.AtomicReference;

public class EmployeeBO {

    int instancecount= 2;

    public void process(){

        //int localvariable=3;

        final AtomicReference<Integer> localvariable=new AtomicReference<>(3);
        //AtomicInteger count=new AtomicInteger(5);

        // we can use AtomicReference class which can use  to modify local variable because it create temporary memory for local variable
        // and lambda will treat like this because local variable are stored in stack and lambda can treat local variable as final so we cannot
        // modify it because it stored on stack.


        EmployeeServices employeeServices=new EmployeeServices();

        CompanyEmployee companyEmployee= CompanyEmployee
                .builder()
                .fName("shiffali")
                .lName("bansal")
                .salary(20000)
                .build();

        employeeServices.printSalary(companyEmployee,companyEmployee1 -> {

           // instancecount=instancecount+1;
            Integer i = localvariable.get();
            i++;
            localvariable.set(i);
            // localvariable= localvariable+1;           // lambda cannot modify local variable because it will treated as final variable

            System.out.println(companyEmployee1.getSalary()+localvariable.get());
            return companyEmployee1.getSalary()+ localvariable.get();
        });

    }
}
