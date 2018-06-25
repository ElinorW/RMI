package com.rmi.demo;

import static java.lang.Math.random;
import static java.util.UUID.randomUUID;

public class CabBookingServiceImpl implements CabBookingService {
    @Override
    public Booking bookRide(String pickUpLocation) throws BookingException {
        if (random() < 0.3) throw new BookingException("Cab unavailable");
        return new Booking("23432");
                /*Booking(randomUUID().toString());*/
    }
}
