package org.example.task01;

import java.util.List;
import java.util.Random;

public class Randomizer {
    Character character;

    public static Character createCharacter(){
        return new Character(createName(), createWeapon());
    }
    private static String createName(){
        List<Integer> list = new Random().ints(5,65,90).boxed().toList();
        StringBuilder name = new StringBuilder();
        // Через стрим не получилось, а хотелось бы
        for(Integer i: list){
            char s = ((char) ((int)i));
            name.append(s);


        }

        return name.toString();
    }

    private static WeaponType createWeapon(){
        WeaponType[] w = WeaponType.values();
        return w[(int) (Math.random() * 6)];
    }







}
