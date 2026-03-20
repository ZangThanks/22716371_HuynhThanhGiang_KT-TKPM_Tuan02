package org.example.strategy;

public class ShippingStrategy implements ActionStrategy {

    @Override
    public void execute() {
        System.out.println("Shipping order...");
    }
}
