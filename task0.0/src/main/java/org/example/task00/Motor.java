package org.example.task00;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Motor implements Engine{
    private int Durability;
    public Motor(){
        this.Durability = 100;
    }
    public int showEngineInfo(){
        return getDurability();
    }
}
