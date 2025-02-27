package com.baeldung.decorator;

public class RacingStripes extends CarDecorator {

    public RacingStripes(Car car) {
        super(car);
    }
    
    public String decorate() {
        return super.decorate() + decorateWithRacingStripes();
    }
    
    private String decorateWithRacingStripes() {
        return " with Racing Stripes";
    }
}
