package org.example.builder;

import org.example.builder.enums.KeyboardType;
import org.example.builder.enums.RAMType;
import org.example.builder.enums.StorageType;
import org.example.builder.products.*;

public class DeviceDirector {

    private DeviceBuilder builder;

    public DeviceDirector() {}

    public void buildSmartPhone() {
        this.builder.setCamera(new Camera("700 * 200", 54, "Cannon"));
        this.builder.setStorage(new Storage("256 GB", "HDM-V2", "ADATA", StorageType.INTERNAL_STORAGE));
        this.builder.setKeyboard(new Keyboard("QWERTY", KeyboardType.ON_SCREEN));
        this.builder.setRAM(new RAM(3948, RAMType.MOBILE_RAM, "V3-12.2"));
        this.builder.setProcessor(new Processor("tokay", "snapdragon", "8", "2.5 GHz", "MOBILE"));
    }

    public void buildComputer() {
        this.builder.setCamera(new Camera("1600 * 900", 60, "Lenovo"));
        this.builder.setStorage(new Storage("1 TB", "HDM-TKS-2", "ADATA", StorageType.SSD));
        this.builder.setKeyboard(new Keyboard("QWERTY", KeyboardType.INTEGRATED));
        this.builder.setRAM(new RAM(7948, RAMType.DDR5, "WMV3-12.2"));
        this.builder.setProcessor(new Processor("AMD", "Rayzen", "8", "3.5 GHz & 2.5 GHz", "x64"));
    }

    public void setBuilder(DeviceBuilder builder) {
        this.builder = builder;
    }
}
