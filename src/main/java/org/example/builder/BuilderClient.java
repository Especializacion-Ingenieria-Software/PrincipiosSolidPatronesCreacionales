package org.example.builder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.example.builder.products.Computer;
import org.example.builder.products.SmartPhone;

public class BuilderClient {

    private static final JsonMapper mapper = new JsonMapper();

    public static void main(String[] args) throws JsonProcessingException {
        SmartPhoneBuilder smartPhoneBuilder = new SmartPhoneBuilder();
        DeviceDirector director = new DeviceDirector();
        director.setBuilder(smartPhoneBuilder);
        director.buildSmartPhone();
        SmartPhone smartPhone = smartPhoneBuilder.getResult();
        // Se covierte a json solo por facilidad en transformación y visualización
        System.out.println(mapper.writer().writeValueAsString(smartPhone));

        ComputerBuilder computerBuilder = new ComputerBuilder();
        director.setBuilder(computerBuilder);
        director.buildComputer();
        Computer computer = computerBuilder.getResult();
        // Se covierte a json solo por facilidad en transformación y visualización
        System.out.println(mapper.writer().writeValueAsString(computer));
    }

}
