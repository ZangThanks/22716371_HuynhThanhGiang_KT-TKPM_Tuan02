package org.example.strategy;

public class ValidateOrderStrategy implements ActionStrategy {

    @Override
    public void execute() {
        System.out.println("Validating order...");
    }
}
