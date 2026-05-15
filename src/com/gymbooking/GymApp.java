package com.gymbooking;

import com.gymbooking.model.Booking;
import com.gymbooking.model.GymClass;
import com.gymbooking.model.Member;
import com.gymbooking.util.GymUtils;

import java.util.ArrayList;
import java.util.List;

public class GymApp {

    private List<Member> members = new ArrayList<>();
    private List<GymClass> gymClasses = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public void addMember (Member member) {
        if (GymUtils.isNull(member)) {
            System.out.println("Invalid member");
            return;
        }
        members.add(member);
        System.out.println("Member added: " + member.getFirstname());
    }

    public List<Member> getMembers () {
        return members;
    }

    public void addClass (GymClass gymClass) {
        if (GymUtils.isNull(gymClass)) {
            System.out.println("Invalid gym class.");
            return;
        }
        gymClasses.add(gymClass);
        System.out.println("Gym class added: " + gymClass.getClassName());
    }

    public List<GymClass> getGymClasses() {
        return gymClasses;
    }

    public void addBooking (Booking booking) {
        if(GymUtils.isNull(booking)) {
            System.out.println("Invalid booking.");
            return;
        }

        bookings.add(booking);
        System.out.println("Booking added: " + booking.getMember().getFirstname());
    }

    public List<Booking> getBookings () {
        return bookings;
    }

    public void printAllMembers() {
        members.forEach(System.out::println);
    }

    public void printAllClasses() {
        gymClasses.forEach(System.out::println);
    }

    public void printAllBookings() {
        bookings.forEach(System.out::println);
    }
}
