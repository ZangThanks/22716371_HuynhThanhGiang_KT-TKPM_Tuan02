package org.example.decorator;

import org.example.strategy.TaxStrategy;
import org.example.strategy.VATStrategy;

public class VATDecorator extends TaxDecorator {
    public VATDecorator(TaxStrategy wrapped) {
        super(wrapped);
    }

    public double calculate(double price) {
        return super.calculate(price) + new VATStrategy().calculate(price);
    }
}
