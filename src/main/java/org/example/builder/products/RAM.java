package org.example.builder.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.builder.enums.RAMType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RAM {

    private int size;
    private RAMType type;
    private String model;

}
