package org.example.structural.Decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }
    public String makeCodeReview(){
        return "make code review";
    }

    @Override
    public String write() {
        return super.write() + makeCodeReview();
    }
}
