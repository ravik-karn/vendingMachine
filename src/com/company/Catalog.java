package com.company;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<Product, Integer> items;

    private Catalog(Map<Product, Integer> items) {
        this.items = items;
    }

    public static Catalog initialize() {
        Map<Product, Integer> items = new HashMap<Product, Integer>();
        items.put(new Product(1, "A1", 30), 10);
        items.put(new Product(2, "A2", 40), 10);
        items.put(new Product(2, "A3", 400), 10);
        items.put(new Product(2, "A4", 340), 10);
        return new Catalog(items);
    }

    public void addItem(Product product, Integer quantity) {
        if (this.items.containsKey(product)) {
            this.items.put(product, this.items.get(product) + quantity);
        } else {
            this.items.put(product, quantity);
        }
    }

    public void dispenseItem(Product product) {
        this.items.put(product, this.items.get(product) - 1);
        if (this.items.get(product) == 0) {
            this.items.remove(product);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Product product : items.keySet()) {
            builder.append(product.toString());
        }

        return builder.toString();
    }

    public Product searchProduct(String name) {
        for (Product product : items.keySet()) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
