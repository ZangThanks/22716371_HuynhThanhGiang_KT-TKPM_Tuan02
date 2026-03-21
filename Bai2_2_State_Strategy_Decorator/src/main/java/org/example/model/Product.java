package org.example.model;

import org.example.state.ProductState;
import org.example.strategy.TaxStrategy;

public class Product {
    private String name;
    private double price;
    private ProductState state;

    public Product(String name, double price, ProductState state) {
        this.name = name;
        this.price = price;
        this.state = state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public double calculateTotalPrice() {
        TaxStrategy strategy = state.getTaxStrategy();
        double tax = strategy.calculate(price);
        return price + tax;
    }

    public void display() {
        System.out.println(name + " - Giá gốc: " + price +
                " | Tổng sau thuế: " + calculateTotalPrice());
    }
}
