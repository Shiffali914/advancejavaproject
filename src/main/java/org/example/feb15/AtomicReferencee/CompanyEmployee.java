package org.example.feb15.AtomicReferencee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder

public class CompanyEmployee {

    private String fName;
    private  String lName;
    private Integer salary;


}
