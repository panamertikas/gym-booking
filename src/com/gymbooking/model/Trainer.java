package com.gymbooking.model;

import com.gymbooking.util.GymUtils;

public class Trainer extends Person{

    private String speciality;

    public Trainer() {

    }

    public Trainer(String firstname, String lastname, int age, String speciality) {
        super(firstname, lastname, age);
        setSpeciality(speciality);
    }

    public static Trainer of(String firstname, String lastname, int age, String speciality) {
        return new Trainer(firstname, lastname, age, speciality);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        if(GymUtils.isNullOrEmpty(speciality)){
            System.out.println("Speciality can not be null");
            return;
        }
        this.speciality = speciality;
    }



    @Override
    public String toString() {
        return "Trainer Information" + "\n" + "Firstname: " + getFirstname() + "\n" + "Lastname: " + getLastname() + "\n" +
                  "Age: " + getAge() + "\n" + "Speciality: " + getSpeciality() ;
    }
}
