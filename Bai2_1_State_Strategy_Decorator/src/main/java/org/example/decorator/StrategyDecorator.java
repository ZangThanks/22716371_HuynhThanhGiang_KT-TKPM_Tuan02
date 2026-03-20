package org.example.decorator;

import org.example.strategy.ActionStrategy;

public class StrategyDecorator implements ActionStrategy {
    protected ActionStrategy wrapped;

    public StrategyDecorator(ActionStrategy wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void execute() {
        wrapped.execute();
    }
}
