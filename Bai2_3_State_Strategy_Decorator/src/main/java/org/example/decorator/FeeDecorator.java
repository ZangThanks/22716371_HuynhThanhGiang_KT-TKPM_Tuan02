package org.example.decorator;

import org.example.strategy.PaymentStrategy;

public class FeeDecorator extends PaymentDecorator {
    public FeeDecorator(PaymentStrategy wrapped) {
        super(wrapped);
    }

    public double pay(double amount) {
        double fee = amount * 0.05;
        System.out.println("Phí xử lý: " + fee);
        return super.pay(amount + fee);
    }
}
