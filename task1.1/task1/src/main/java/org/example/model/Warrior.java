package org.example.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.example.move.PhysAttack;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super(30, 0,80, 0);

    }


    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - hero.resist(this.getPhysAtt(), hero.getPhysDef()));
        hero.checkHealth();
        System.out.println(hero);
    }

}
