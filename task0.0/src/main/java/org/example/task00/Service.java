package org.example.task00;

import lombok.Data;

import java.util.Arrays;

@Data
public class Service {
    private Car car;


    public void repairEngine(){
        car.getMotor().setDurability(100);

    }

    public Car repairEngine(Car[] cars){
        return Arrays.stream(cars).sorted().findFirst().get();
    }

}
