package org.example.feb18;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder

public class Employees {

  private String fName;
  private  String lName;
  private Integer Salary;
  private String Gender;
  private List<Address>addresses;


}
