package org.example.move;

import org.example.model.Hero;

public interface Healer {

    public void healHimself();
    public void healTeammate(Hero hero);
}
