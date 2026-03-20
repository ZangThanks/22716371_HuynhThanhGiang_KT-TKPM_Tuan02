package org.example.decorator;

import org.example.strategy.ActionStrategy;

public class LoggingDecorator extends StrategyDecorator {

    public LoggingDecorator(ActionStrategy wrapped) {
        super(wrapped);
    }

    public void execute() {
        System.out.println("\nLogging: Starting execution of strategy...");
        wrapped.execute();
        System.out.println("Logging: Finished execution of strategy.");
    }
}
