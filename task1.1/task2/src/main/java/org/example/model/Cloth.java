package org.example.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.example.sizeEnum.Size;

public abstract class Cloth {
    private Size size;

    private Double price;

    private String color;

    public Cloth(Size size, Double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
