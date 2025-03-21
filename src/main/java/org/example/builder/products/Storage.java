package org.example.builder.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.builder.enums.StorageType;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private String capacity;
    private String model;
    private String brand;
    private StorageType storageType;

}
