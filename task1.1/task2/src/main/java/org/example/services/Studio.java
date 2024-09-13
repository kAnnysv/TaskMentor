package org.example.services;

import org.example.clothInterface.ManCloth;
import org.example.clothInterface.WomanCloth;
import org.example.model.Cloth;

public class Studio {

    public static void dressMan(Cloth[] cloths) {
        for(Cloth c:cloths){
            if(c instanceof ManCloth){
                System.out.println(c);
            }
        }


    }


    public static void dressWoman(Cloth[] cloths) {
        for(Cloth c:cloths){
            if(c instanceof WomanCloth){
                System.out.println(c);
            }
        }


    }

}
