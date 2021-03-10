package com.company.Creators;

import com.company.Products.Product;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<Product, Integer> localInventory = new HashMap<>();

    public Inventory(int multiplier) {
        addToInventory(ProductCreator.reamA4, (int) (multiplier*Math.random()));
        addToInventory(ProductCreator.reamA3, (int) (multiplier*Math.random()));
        addToInventory(ProductCreator.rollerA0, (int) (multiplier*Math.random()));
        addToInventory(ProductCreator.rollerA1, (int) (multiplier*Math.random()));
        addToInventory(ProductCreator.rollerA2, (int) (multiplier*Math.random()));
        addToInventory(ProductCreator.rollerA3, (int) (multiplier*Math.random()));
    }

    private void addToInventory(Product product, int amount) {
        localInventory.put(product,amount);
    }

    public void setAmount(Product product, int amount) {
        if(localInventory.containsKey(product)) {
            localInventory.replace(product,amount);
        }
        localInventory.put(product,amount);
    }

    public Integer getAmount(Product product) {
        return localInventory.get(product);
    }

    public Map getInventory() {
        return localInventory;
    }

    public void checkInventory(Map localInventory) {
        System.out.println("Bieżący stan magazynu:");
        localInventory.forEach((product, amount) -> System.out.println(product.toString() + " - " + amount + " szt."));
        System.out.println();
    }
}
