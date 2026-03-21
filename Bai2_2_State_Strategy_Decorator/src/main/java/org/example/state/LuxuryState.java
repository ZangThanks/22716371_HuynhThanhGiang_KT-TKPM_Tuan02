package org.example.state;

import org.example.decorator.LuxuryDecorator;
import org.example.decorator.VATDecorator;
import org.example.strategy.ConsumptionTaxStrategy;
import org.example.strategy.TaxStrategy;

public class LuxuryState implements ProductState {
    public TaxStrategy getTaxStrategy() {
        return new LuxuryDecorator(
                new VATDecorator(new ConsumptionTaxStrategy())
        );
    }
}
