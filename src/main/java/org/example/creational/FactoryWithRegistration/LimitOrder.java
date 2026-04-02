package org.example.creational.FactoryWithRegistration;

public class LimitOrder implements OrderHandler{
    @Override
    public void process() {
        System.out.println("process market");
    }
}
