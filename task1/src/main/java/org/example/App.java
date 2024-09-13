package org.example;

import org.example.model.Magician;
import org.example.model.Paladin;
import org.example.model.Shaman;
import org.example.model.Warrior;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Warrior warrior = new Warrior();
        Magician magician = new Magician();
        Paladin paladin = new Paladin();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        paladin.physicalAttack(magician);
        shaman.healTeammate(magician);
        magician.magicalAttack(paladin);
        shaman.physicalAttack(warrior);
        paladin.healHimself();
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);

        }


    }
}
