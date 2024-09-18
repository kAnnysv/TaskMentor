package org.example.entity;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
@Getter
public class Stock {

    private Map<UUID , Product> stocks = new HashMap<>();

    public void addProduct(Product product){
        stocks.put(product.getId(), product);
    }

    public void checkProduct(){
        stocks.entrySet().stream().filter(k -> k.getValue().getQuantityStock() > 5).forEach(System.out::println);
    }

    public Set<UUID> addSetProduct(){
        return stocks.entrySet().stream().filter(k -> k.getValue().getQuantityStock() > 5).map(x -> x.getKey()).collect(Collectors.toSet());
    }

    public void addTen(Set<UUID> keys){
        for(UUID k: keys){
            for (Entry entry: stocks.entrySet()){
                if (k.equals(entry.getKey())){
                    Product product = (Product) entry.getValue();
                    product.setQuantityStock(product.getQuantityStock() + 10);
                    addProduct(product);

                }
            }
        }

    }




}
