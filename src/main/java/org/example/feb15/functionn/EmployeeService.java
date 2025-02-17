package org.example.feb15.functionn;

import java.util.function.Function;

public class EmployeeService {

    public Integer printSalary(Emply employee, Function<Emply,Integer> function)
    {
        return function.apply(employee);

    }

    public Stdnt convertToStudent(Emply employee, Function<Emply,Stdnt>function){
        return function.apply(employee);
    }
}
