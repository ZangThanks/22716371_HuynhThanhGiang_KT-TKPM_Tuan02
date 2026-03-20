package org.example.strategy;

public class RefundStrategy implements ActionStrategy {

    @Override
    public void execute() {
        System.out.println("Processing refund...");
    }

}
