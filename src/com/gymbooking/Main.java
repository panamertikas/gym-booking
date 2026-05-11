package com.gymbooking;
import com.gymbooking.model.GymClass;
import com.gymbooking.model.Member;

public class Main {
    public static void main(String[] args) {


        GymClass personal = new GymClass("Personal training", "George", 5);

        GymClass semiPersonal = new GymClass("Semi Personal", "Maria", 12);


        Member m1 = new Member("Panos", "Mertikas", "panos@mail.com", -5);
        System.out.println(m1);

        Member m2 = new Member();
        m2.setAge(-10);

        GymClass yoga = new GymClass("Yoga", "Maria", 2);
        yoga.addMember();
        yoga.addMember();
        yoga.addMember(); // γεμάτο
        yoga.removeMember();
        yoga.removeMember();
        yoga.removeMember(); // άδειο
    }
}
