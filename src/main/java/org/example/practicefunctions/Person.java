package org.example.practicefunctions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Person {

    private String name;
    private String city;
}
