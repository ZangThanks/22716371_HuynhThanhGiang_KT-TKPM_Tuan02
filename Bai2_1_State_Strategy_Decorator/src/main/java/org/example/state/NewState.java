package org.example.state;

import org.example.decorator.LoggingDecorator;
import org.example.strategy.ActionStrategy;
import org.example.strategy.ValidateOrderStrategy;

public class NewState implements OrderState {

    @Override
    public void handle(OrderContext context) {
        ActionStrategy strategy = new LoggingDecorator(new ValidateOrderStrategy());
        strategy.execute();
        context.setState(new ProcessingState());
    }
}
