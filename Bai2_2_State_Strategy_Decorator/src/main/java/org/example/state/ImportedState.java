package org.example.state;

import org.example.decorator.ConsumptionDecorator;
import org.example.strategy.TaxStrategy;
import org.example.strategy.VATStrategy;

public class ImportedState implements ProductState {
    public TaxStrategy getTaxStrategy() {
        return new ConsumptionDecorator(new VATStrategy());
    }
}
