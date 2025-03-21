package org.example.builder;


import org.example.builder.products.*;

public interface DeviceBuilder {

    void setRAM(RAM ram);

    void setProcessor(Processor processor);

    void setStorage(Storage storage);

    void setKeyboard(Keyboard keyboard);

    void setCamera(Camera camera);

}
