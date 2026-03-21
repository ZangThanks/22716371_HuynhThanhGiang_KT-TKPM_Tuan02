package org.example.state;

import org.example.strategy.TaxStrategy;
import org.example.strategy.VATStrategy;

public class NormalState implements ProductState {
    public TaxStrategy getTaxStrategy() {
        return new VATStrategy(); // chỉ VAT
    }
}
