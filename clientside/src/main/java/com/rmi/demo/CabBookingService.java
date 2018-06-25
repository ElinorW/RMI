package com.rmi.demo;

public interface CabBookingService {
    Booking bookRide(String pickUpLocation) throws BookingException;
}

