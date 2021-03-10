package com.company.Products;

public class Product {
    String name;
    Double price;
    Double weight;
    int length;
    int width;
    int height;
    int grammage;

    public Product(String name, Double price, Double weight, int length, int width, int height, int grammage) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.grammage = grammage;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name;
    }
}
