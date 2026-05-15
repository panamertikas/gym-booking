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
        MemberService memberService = new MemberService();
        GymClassService gymClassService = new GymClassService();

        Member m1 = Member.of("Panos", "Mertikas", "panos@mail.com", 25);
        Member m2 = Member.of("Maria", "Papadopoulou", "maria@mail.com", 30);

        GymClass yoga = GymClass.of("Yoga", "Maria", 10);

        memberService.addMember(m1);
        memberService.addMember(m2);
        gymClassService.addGymClass(yoga);

        System.out.println("Members: " + memberService.getAllMembers().size());
        System.out.println("Classes: " + gymClassService.getAllGymClasses().size());
    }
}





