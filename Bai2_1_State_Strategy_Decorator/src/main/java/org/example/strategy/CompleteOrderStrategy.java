package org.example.strategy;

public class CompleteOrderStrategy implements ActionStrategy {

    @Override
    public void execute() {
        System.out.println("Completing order...");
    }
}
