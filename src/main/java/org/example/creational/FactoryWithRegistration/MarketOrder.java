package org.example.creational.FactoryWithRegistration;

public class MarketOrder implements OrderHandler{
    @Override
    public void process() {
        System.out.println("marketOrderLogic");
    }
}
