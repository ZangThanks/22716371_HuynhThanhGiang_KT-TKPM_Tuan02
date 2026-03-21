package org.example.decorator;

import org.example.strategy.PaymentStrategy;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(PaymentStrategy wrapped) {
        super(wrapped);
    }

    public double pay(double amount) {
        double discount = amount * 0.1;
        System.out.println("Giảm giá: " + discount);
        return super.pay(amount - discount);
    }
}
