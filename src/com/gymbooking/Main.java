package com.gymbooking;
import com.gymbooking.exceptions.GymClassEmptyException;
import com.gymbooking.exceptions.GymClassFullException;
import com.gymbooking.interfaces.IPrintable;
import com.gymbooking.model.*;

public class Main {

    public static void main(String[] args) {

        Member m1 = Member.of("Panos", "Mertikas", "panos@mail.com", 25);

        IPrintable printable = () -> System.out.println(m1);
        printable.print();
    }
}





