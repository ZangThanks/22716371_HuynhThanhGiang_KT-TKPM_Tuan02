package org.example.state;

import org.example.model.PaymentContext;

public interface PaymentState {
    void handle(PaymentContext context, double amount);
}
