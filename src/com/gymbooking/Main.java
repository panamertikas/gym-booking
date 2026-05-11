package com.gymbooking;
import com.gymbooking.model.GymClass;
import com.gymbooking.model.Member;

public class Main {
    public static void main(String[] args) {
//        Member panos = new Member("Panos", "Mertikas", "dsadas@dasda.gr", 33);
//
//        Member errika = new Member("Errika", "Makri", "dfvdfs@ddsf.gr", 55);
//
//        System.out.println(panos);
//        System.out.println(errika);

//        GymClass personal = new GymClass("Personal training", "George", 5, 2);
//
//        GymClass semiPersonal = new GymClass("Semi Personal", "Maria", 12, 4);
//
//        System.out.println(personal);
//        System.out.println(semiPersonal);

        Member m1 = new Member("Panos", "Mertikas", "panos@mail.com", -5);
        System.out.println(m1);

        Member m2 = new Member();
        m2.setAge(-10);

        GymClass yoga = new GymClass("Yoga", "Maria", 2, 0);
        yoga.addMember();
        yoga.addMember();
        yoga.addMember(); // γεμάτο
        yoga.removeMember();
        yoga.removeMember();
        yoga.removeMember(); // άδειο
    }
}
