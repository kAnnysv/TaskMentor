package org.example.model;

import org.example.clothInterface.ManCloth;
import org.example.clothInterface.WomanCloth;
import org.example.sizeEnum.Size;

public class Tshirt extends Cloth implements ManCloth, WomanCloth {
    public Tshirt(Size size, Double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
