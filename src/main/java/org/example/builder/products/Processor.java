package org.example.builder.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Processor {

    private String brand;
    private String model;
    private String cores;
    private String ghz;
    private String architecture;
}
