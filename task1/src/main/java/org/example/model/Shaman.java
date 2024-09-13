package org.example.model;

import org.example.move.Healer;
import org.example.move.MagicAttack;
import org.example.move.PhysAttack;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack {

    public Shaman(){
        super(10,15, 20, 20);
    }
    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
        checkHealth();
        System.out.println(this);

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        hero.checkHealth();
        System.out.println(hero);


    }
    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - hero.resist(this.getMagiAtt(), hero.getMagiDef()));
        hero.checkHealth();
        System.out.println(hero);


    }
    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - hero.resist(this.getPhysAtt(), hero.getPhysDef()));
        hero.checkHealth();
        System.out.println(hero);
    }
}
