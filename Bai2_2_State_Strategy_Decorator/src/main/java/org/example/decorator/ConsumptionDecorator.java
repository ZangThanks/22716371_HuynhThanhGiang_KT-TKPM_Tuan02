package org.example.decorator;

import org.example.strategy.ConsumptionTaxStrategy;
import org.example.strategy.TaxStrategy;

public class ConsumptionDecorator extends TaxDecorator {
    public ConsumptionDecorator(TaxStrategy wrapped) {
        super(wrapped);
    }

    public double calculate(double price) {
        return super.calculate(price) + new ConsumptionTaxStrategy().calculate(price);
    }
}
