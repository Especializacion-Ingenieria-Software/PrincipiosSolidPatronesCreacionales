package org.example.builder.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.builder.enums.KeyboardType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Keyboard {

    private String alphabetDistribution;
    private KeyboardType type;

}
