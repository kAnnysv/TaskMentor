package org.example.task02;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Coliseum {



    public static void fight(Warrior warrior1, Warrior warrior2){
        ArrayList<Warrior> warriors = new ArrayList<>();
        warriors.add(warrior1);
        warriors.add(warrior2);
        while (true){
            warrior1.setMove();
            warrior2.setMove();
            Collections.sort(warriors);
            System.out.println(warriors.get(0).getName() + " attacked " + warriors.get(1).getName());
            warriors.get(1).setHealth(warriors.get(1).getHealth() - 20);
            System.out.println("Health " + warriors.get(1).getName() + " = " + warriors.get(1).getHealth());

            if(warrior1.getHealth() <= 0 || warrior2.getHealth() <= 0){
                System.out.println(warrior1.getHealth() <= 0 ? warrior2.getName() + " - Winner" : warrior1.getName() + " - Winner");
                return;
            }


        }


    }




}
