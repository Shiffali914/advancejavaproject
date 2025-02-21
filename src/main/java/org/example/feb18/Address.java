package org.example.feb18;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder

public class Address {
    private String postalcode;
    private String city;

}
