package org.example.decorator;

import org.example.strategy.TaxStrategy;

public abstract class TaxDecorator implements TaxStrategy {
    protected TaxStrategy wrapped;

    public TaxDecorator(TaxStrategy wrapped) {
        this.wrapped = wrapped;
    }

    public double calculate(double price) {
        return wrapped.calculate(price);
    }
}
