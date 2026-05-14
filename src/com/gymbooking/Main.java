package com.gymbooking;
import com.gymbooking.exceptions.GymClassEmptyException;
import com.gymbooking.exceptions.GymClassFullException;
import com.gymbooking.model.*;

public class Main {

    public static void main(String[] args) {

        Member m1 = Member.of("Panos", "Mertikas", "panos@mail.com", 25);
        Member m2 = Member.of("Panos", "Mertikas", "panos@mail.com", 25);
        System.out.println(m1.equals(m2));
    }
}





