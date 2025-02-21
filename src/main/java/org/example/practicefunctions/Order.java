package org.example.practicefunctions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@AllArgsConstructor

public class Order {
    private List<Items>items;

}
