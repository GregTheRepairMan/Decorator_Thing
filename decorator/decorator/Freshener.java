package com.baeldung.decorator;

public class Freshener extends CarDecorator {

    public Freshener(Car car) {
        super(car);
    }
    
    public String decorate() {
        return super.decorate() + decorateWithFreshener();
    }

    private String decorateWithFreshener() {
        return " with Freshener";
    }
}
