package org.example.decorator;

import org.example.strategy.LuxuryTaxStrategy;
import org.example.strategy.TaxStrategy;

public class LuxuryDecorator extends TaxDecorator {
    public LuxuryDecorator(TaxStrategy wrapped) {
        super(wrapped);
    }

    public double calculate(double price) {
        return super.calculate(price) + new LuxuryTaxStrategy().calculate(price);
    }
}
