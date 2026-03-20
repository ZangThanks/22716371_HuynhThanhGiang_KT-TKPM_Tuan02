package org.example.state;

public class OrderContext {
    private OrderState state;

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }
}
