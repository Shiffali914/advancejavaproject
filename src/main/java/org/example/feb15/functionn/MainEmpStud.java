package org.example.feb15.functionn;

public class MainEmpStud {
    public static void main(String[] args) {

       /* Stdnt student=new Stdnt("Chris","s");
        Stdnt student1= Stdnt.builder().fName("chris").lName("s").build();  */  //builder is static method

        EmployeeService employeeService=new EmployeeService();

        Emply employee= Emply
                .builder()
                .fName("shiffali")
                .lName("bansal")
                .Salary(20000)
                .build();

        Integer i = employeeService.printSalary(employee, (e) -> e.getSalary());
        System.out.println(i);

        Stdnt stdnt = employeeService.convertToStudent(employee, (e) ->
                 Stdnt.builder()
                .fName(e.getFName())
                .lName(e.getLName())
                .build());

        System.out.println(stdnt);
    }
}

/*Functional Interfaces

1. Predicate Interface
2. Function Interface
3. Consumer Interface
4. Supplier Interface
5. BiFunction Interface
6. Biconsumer Interface
7. Comparator

 */
