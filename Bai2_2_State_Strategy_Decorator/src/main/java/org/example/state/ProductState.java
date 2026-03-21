package org.example.state;

import org.example.strategy.TaxStrategy;

public interface ProductState {
    TaxStrategy getTaxStrategy();
}
