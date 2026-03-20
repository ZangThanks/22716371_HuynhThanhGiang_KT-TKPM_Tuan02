package org.example;

import org.example.state.CancelledState;
import org.example.state.NewState;
import org.example.state.OrderContext;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.setState(new NewState());
        order.process();

        order.process();

        order.process();

        order.setState(new CancelledState());
        order.process();
    }
}