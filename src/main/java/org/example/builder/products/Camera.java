package org.example.builder.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Camera {

    private String resolution;
    private int mpx;
    private String brand;

}
