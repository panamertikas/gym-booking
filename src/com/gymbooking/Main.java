package com.gymbooking;
import com.gymbooking.exceptions.GymClassEmptyException;
import com.gymbooking.exceptions.GymClassFullException;
import com.gymbooking.model.*;

public class Main {

    public static void main(String[] args) {

        Member m = Member.of("Panos", "Mertikas", "panos@mail.com", 25);
        Trainer t = Trainer.of("Maria", "Papadopoulou", 35, "Yoga");

        System.out.println(m.getRole());
        System.out.println(t.getRole());
    }
}





