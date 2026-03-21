package org.example.model;

import org.example.state.PaymentState;
import org.example.strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentState state;
    private PaymentStrategy strategy;

    public PaymentContext() {
    }

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(double amount) {
        state.handle(this, amount);
    }

    public double executePayment(double amount) {
        return strategy.pay(amount);
    }
}
