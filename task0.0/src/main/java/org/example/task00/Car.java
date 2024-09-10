package org.example.task00;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car implements Comparable<Car>{
    private String model;
    private Engine motor;
    public Car(String model){
        this.model = model;
        this.motor = new Motor();


    }
    public void startMove(Integer km){
        if(km >= 10000){
            System.out.println("motor killed");
            return;
        } else if (km <= 0) {
            System.out.println("not correct data");
            return;

        }else {
            int dur = km / 100;

            int current = motor.getDurability();
            if(current <= dur){
                System.out.println("motor killed");
                return;
            }else{
                motor.setDurability(current - dur);
            }




        }
    }



    @Override
    public int compareTo(Car o) {
        return this.motor.getDurability() - o.motor.getDurability();
    }
}
