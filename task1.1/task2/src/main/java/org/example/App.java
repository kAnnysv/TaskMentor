package org.example;

import org.example.model.*;
import org.example.services.Studio;
import org.example.sizeEnum.Size;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Cloth[] cloths = {new Skirt(Size.S, 100.90, "Green"),
                new Tie(Size.M, 25.45, "Gold"),
                new Trousers(Size.L, 56.43, "Black"),
                new Tshirt(Size.M, 15.65, "Red")
        };

        Studio.dressMan(cloths);
        System.out.println("===========================");
        Studio.dressWoman(cloths);



    }
}
