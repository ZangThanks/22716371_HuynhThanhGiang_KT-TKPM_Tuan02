package org.example.state;

import org.example.model.PaymentContext;

public class CompletedState implements PaymentState {
    public void handle(PaymentContext context, double amount) {
        double finalAmount = context.executePayment(amount);
        System.out.println("Thanh toán thành công: " + finalAmount);
    }
}
