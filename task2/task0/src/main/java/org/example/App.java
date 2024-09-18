package org.example;

import org.example.entity.Product;
import org.example.entity.Stock;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Stock stock = new Stock();

        for (int i = 1; i < 7; i++) {
            stock.addProduct(new Product("product" + i, "fabric" + i, i + 2 ));

        }
        stock.checkProduct();
        System.out.println("===============================");

        Set<UUID> keys = new HashSet<>();
        keys = stock.addSetProduct();




        stock.addTen(keys);

        System.out.println(stock.getStocks());



    }
}
