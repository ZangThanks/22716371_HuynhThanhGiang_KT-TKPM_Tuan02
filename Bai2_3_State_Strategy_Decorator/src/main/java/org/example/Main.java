package org.example;

import org.example.decorator.DiscountDecorator;
import org.example.decorator.FeeDecorator;
import org.example.model.PaymentContext;
import org.example.state.PendingState;
import org.example.strategy.CreditCardPayment;
import org.example.strategy.PaymentStrategy;
import org.example.strategy.PaypalPayment;

public class Main {
    public static void main(String[] args) {
        // Strategy PayPal + Discount
        PaymentContext context = new PaymentContext();

        context.setStrategy(
                new FeeDecorator(new CreditCardPayment())
        );

        context.setState(new PendingState());
        context.process(100);
        context.process(100);

        System.out.println("----- Đổi Strategy -----");

        context.setStrategy(
                new DiscountDecorator(new PaypalPayment())
        );

        context.setState(new PendingState());
        context.process(200);
        context.process(200);


        // Decorator xếp chồng
        PaymentStrategy base = new CreditCardPayment();

        PaymentStrategy withDiscount = new DiscountDecorator(base);
        PaymentStrategy finalPayment = new FeeDecorator(withDiscount);

        double result = finalPayment.pay(100);

        System.out.println("Tổng tiền: " + result);
    }
}