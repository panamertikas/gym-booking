package com.gymbooking;
import com.gymbooking.enums.MembershipType;
import com.gymbooking.exceptions.GymClassEmptyException;
import com.gymbooking.exceptions.GymClassFullException;
import com.gymbooking.interfaces.IPrintable;
import com.gymbooking.model.*;

public class Main {

    public static void main(String[] args) {
        GymApp gym = new GymApp();

        Member m1 = Member.of("Panos", "Mertikas", "panos@mail.com", 25);
        Member m2 = Member.of("Maria", "Papadopoulou", "maria@mail.com", 30);

        GymClass yoga = GymClass.of("Yoga", "Maria", 10);

        gym.addMember(m1);
        gym.addMember(m2);
        gym.addClass(yoga);

        System.out.println("Members: " + gym.getMembers().size());
        System.out.println("Classes: " + gym.getGymClasses().size());

        gym.printAllMembers();
    }
}





