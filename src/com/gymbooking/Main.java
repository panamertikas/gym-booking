package com.gymbooking;
import com.gymbooking.enums.MembershipType;
import com.gymbooking.exceptions.GymClassEmptyException;
import com.gymbooking.exceptions.GymClassFullException;
import com.gymbooking.interfaces.IPrintable;
import com.gymbooking.model.*;
import com.gymbooking.service.GymClassService;
import com.gymbooking.service.MemberService;

public class Main {

    public static void main(String[] args) {
        Member m1 = Member.of("Panos", "Mertikas", "panos@gmail.com", 25);
        Member m2 = Member.of("Maria", "Papadopoulou", "invalid-email", 30);
        Member m3 = Member.of("Nikos", "Nikolaou", "nikos@yahoo.fr", 35);

        System.out.println(m1);
        System.out.println(m2.getMail());
        System.out.println(m3.getMail());
    }
}





