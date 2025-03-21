package org.example.builder.products;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Computer {

    private RAM ram;
    private Processor processor;
    private Storage storage;
    private Keyboard keyboard;
    private Camera camera;

    public Computer(RAM ram, Processor processor, Storage storage, Keyboard keyboard, Camera camera) {
        this.ram = ram;
        this.processor = processor;
        this.storage = storage;
        this.keyboard = keyboard;
        this.camera = camera;
    }

}
