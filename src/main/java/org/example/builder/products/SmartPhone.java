package org.example.builder.products;

import lombok.Data;

@Data
public class SmartPhone {

    private RAM ram;
    private Processor processor;
    private Storage storage;
    private Keyboard keyboard;
    private Camera camera;

    public SmartPhone(RAM ram, Processor processor, Storage storage, Keyboard keyboard, Camera camera) {
        this.ram = ram;
        this.processor = processor;
        this.storage = storage;
        this.keyboard = keyboard;
        this.camera = camera;
    }

}
