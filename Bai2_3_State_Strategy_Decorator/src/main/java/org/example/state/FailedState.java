package org.example.state;

import org.example.model.PaymentContext;

public class FailedState implements PaymentState {
    public void handle(PaymentContext context, double amount) {
        System.out.println("Thanh toán thất bại!");
    }
}
