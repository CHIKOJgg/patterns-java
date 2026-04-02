package org.example.structural.Decorator;

public class DeveloperDecorator implements Developer{
    Developer developer;
    DeveloperDecorator(Developer developer){
        this.developer = developer;
    }

    @Override
    public String write() {
        return developer.write();
    }
}
