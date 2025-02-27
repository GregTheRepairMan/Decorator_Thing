package com.baeldung.decorator;

import static com.baeldung.util.LoggerUtil.LOG;

public class DecoratorPatternDriver {

    public static void main(String[] args) {
        // car with just one Freshener
        Car car1 = new Freshener(new CarImpl());
        LOG.info(car1.decorate());

        // Car with two Fresheners and Racing stripes
        Car car2 = new RacingStripes(new Freshener(new Freshener(new CarImpl())));
        LOG.info(car2.decorate());

        // Car with a Fresheners, Racing stripes and Leather Seats
        Car car3 = new RacingStripes(new Freshener(new LeatherSeats(new CarImpl())));
        LOG.info(car3.decorate());
    }

}
