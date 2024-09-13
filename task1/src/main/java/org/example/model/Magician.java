package org.example.model;

import org.example.move.MagicAttack;

public class Magician extends Hero implements MagicAttack {

    public Magician(){
        super(5, 20, 0, 80);
    }



    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - hero.resist(this.getMagiAtt(), hero.getMagiDef()));
        hero.checkHealth();
        System.out.println(hero);


    }


}
