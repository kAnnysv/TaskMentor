package org.example.task02;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Warrior implements Comparable<Warrior>{
    private String name;
    private int health;
    private int move;

    public Warrior(String name) {
        this.name = name;
        this.health = 100;
    }

    public void setMove() {
        this.move = (int) (Math.random() * 100);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int compareTo(Warrior o) {
        return this.move - o.move;
    }
}
