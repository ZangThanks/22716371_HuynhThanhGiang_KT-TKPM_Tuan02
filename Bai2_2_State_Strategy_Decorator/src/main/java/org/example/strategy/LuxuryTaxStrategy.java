package org.example.strategy;

public class LuxuryTaxStrategy implements TaxStrategy {
    public double calculate(double price) {
        return price * 0.2; // 20%
    }
}
