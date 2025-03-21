package org.example.builder;

import org.example.builder.products.*;

public class ComputerBuilder implements DeviceBuilder {

    private RAM ram;
    private Processor processor;
    private Storage storage;
    private Keyboard keyboard;
    private Camera camera;

    @Override
    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    @Override
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    // build
    public Computer getResult() {
        return new Computer(this.ram, this.processor, this.storage, this.keyboard, this.camera);
    }

}
