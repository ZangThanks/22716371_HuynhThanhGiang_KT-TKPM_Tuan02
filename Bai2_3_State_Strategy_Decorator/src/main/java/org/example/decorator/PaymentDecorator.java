package org.example.decorator;

import org.example.strategy.PaymentStrategy;

public abstract class PaymentDecorator implements PaymentStrategy {
    protected PaymentStrategy wrapped;

    public PaymentDecorator(PaymentStrategy wrapped) {
        this.wrapped = wrapped;
    }

    public double pay(double amount) {
        return wrapped.pay(amount);
    }
}
