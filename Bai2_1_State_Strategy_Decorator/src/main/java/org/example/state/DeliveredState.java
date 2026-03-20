package org.example.state;

import org.example.decorator.LoggingDecorator;
import org.example.strategy.ActionStrategy;
import org.example.strategy.CompleteOrderStrategy;

public class DeliveredState implements OrderState {

    @Override
    public void handle(OrderContext context) {
        ActionStrategy strategy = new LoggingDecorator(new CompleteOrderStrategy());
        strategy.execute();
    }
}
