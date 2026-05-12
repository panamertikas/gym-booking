package com.gymbooking;
import com.gymbooking.exceptions.GymClassEmptyException;
import com.gymbooking.exceptions.GymClassFullException;
import com.gymbooking.model.*;

public class Main {

    public static void main(String[] args) {

        Member m = Member.of("Panos", "Mertikas", "panos@mail.com", 25);

        GymClass yoga = GymClass.of("Yoga", "Maria", 10);

        Booking booking = Booking.of("2024-01-15", "10:00", yoga, m);

        System.out.println(booking);
    }
}





