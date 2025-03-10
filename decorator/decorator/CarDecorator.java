package com.baeldung.decorator;

public abstract class CarDecorator implements Car {
    private Car car;
    
    public CarDecorator(Car car) {
        this.car = car;
    }
    
    @Override
    public String decorate() {
        return car.decorate();
    }

}
