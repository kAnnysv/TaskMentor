package org.example.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class Hero {

    private  int health ;
    private int physAtt;
    private int magiAtt;
    private int physDef;
    private int magiDef;

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagiAtt() {
        return magiAtt;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagiDef() {
        return magiDef;
    }

    public Hero(int physAtt, int magiAtt, int physDef, int magiDef) {
        this.health = 100;
        this.physAtt = physAtt;
        this.magiAtt = magiAtt;
        this.physDef = physDef;
        this.magiDef = magiDef;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public int resist(int attack, int def){
        return (int) (attack - (attack * def * 0.01));
    }
    public void checkHealth(){
        if (getHealth() > 100) setHealth(100);
        if(getHealth() < 0) setHealth(0);
    }


    @Override
    public String toString() {
        return new  ToStringBuilder(this)
                .append("health = " + getHealth()).toString();
    }

}
