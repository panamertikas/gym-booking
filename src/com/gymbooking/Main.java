package com.gymbooking;
import com.gymbooking.exceptions.GymClassEmptyException;
import com.gymbooking.exceptions.GymClassFullException;
import com.gymbooking.model.*;

public class Main {

    public static void main(String[] args) {

        Member m = new Member.Builder("Panos", "Mertikas")
                .mail("panos@mail.com")
                .age(25)
                .build();

        System.out.println(m);
    }
}





