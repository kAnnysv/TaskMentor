package org.example.model;

import org.example.clothInterface.ManCloth;
import org.example.sizeEnum.Size;

public class Tie extends Cloth implements ManCloth {
    public Tie(Size size, Double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {

    }
}
