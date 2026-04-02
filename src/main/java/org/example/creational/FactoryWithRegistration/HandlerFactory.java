package org.example.creational.FactoryWithRegistration;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class HandlerFactory {
    private final ConcurrentHashMap<String, Supplier<OrderHandler>> registy = new ConcurrentHashMap<>();


    public void register(String orderType, Supplier<OrderHandler> classname){
        registy.put(orderType,classname);
    }

    public OrderHandler create(String orderType){
        Supplier<OrderHandler> creator = registy.get(orderType);
        if (creator ==null){
            throw new RuntimeException("");

        }
        return creator.get();
    }
}
