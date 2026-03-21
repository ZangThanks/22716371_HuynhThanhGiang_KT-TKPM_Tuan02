package org.example.state;

import org.example.model.PaymentContext;

public class PendingState implements PaymentState {
    public void handle(PaymentContext context, double amount) {
        System.out.println("Đang xử lý thanh toán...");
        context.setState(new CompletedState());
    }
}
