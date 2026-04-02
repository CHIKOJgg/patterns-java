package org.example.creational.FactoryWithRegistration;

public class Application {
    public static HandlerFactory handlerFactory = new HandlerFactory();
    static void main(String[] args) {
        handlerFactory.register("market", MarketOrder::new);
        handlerFactory.register("limit", LimitOrder::new);
        String incomingT = "limit";
        String data = "id=123;qty=100;price=50000";
        OrderHandler orderHandler = handlerFactory.create(incomingT);
        orderHandler.process();
    }
}
