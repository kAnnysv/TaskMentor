package org.example.model;

import org.example.move.Healer;
import org.example.move.PhysAttack;

public class Paladin extends Hero implements PhysAttack, Healer {
    public Paladin() {
        super(15,0,50,20);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
        checkHealth();
        System.out.println(this);

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getMagiAtt() + 10);
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
