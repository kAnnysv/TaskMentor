package org.example.entity;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Product {
    private UUID id;
    private String name;
    private String fabric;
    private int quantityStock;

    public Product( String name, String fabric, int quantityStock) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.fabric = fabric;
        this.quantityStock = quantityStock;
    }
}