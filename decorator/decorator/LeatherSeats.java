package com.baeldung.decorator;

public class LeatherSeats extends CarDecorator {

    public LeatherSeats(Car car) {
        super(car);
    }
    
    public String decorate() {
        return super.decorate() + decorateWithLeatherSeats();
    }

    private String decorateWithLeatherSeats() {
        return " with Leather Seats";
    }
}
