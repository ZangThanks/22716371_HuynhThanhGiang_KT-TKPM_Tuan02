package org.example.strategy;

public class PaypalPayment implements PaymentStrategy {
    public double pay(double amount) {
        System.out.println("Thanh toán bằng PayPal");
        return amount;
    }
}