package org.example.model;

import org.example.clothInterface.WomanCloth;
import org.example.sizeEnum.Size;

public class Skirt extends Cloth implements WomanCloth {
    public Skirt(Size size, Double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {

    }
}
