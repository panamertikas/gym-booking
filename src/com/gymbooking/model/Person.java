package com.gymbooking.model;

import com.gymbooking.util.GymUtils;

public class Person {

    private String firstname;
    private String lastname;
    private int age;

    public Person() {

    }

    public Person(String firstname, String lastname, int age) {
        setFirstname(firstname);
        setLastname(lastname);
        setAge(age);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstname(String firstname) {
        if(GymUtils.isNullOrEmpty(firstname)) {
            System.out.println("Name can not be null");
            return;
        }
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {

        if(GymUtils.isNullOrEmpty(lastname)){
            System.out.println("Last name can not be null.");
            return;
        }
        this.lastname = lastname;
    }

    public void setAge(int age) {
        if (!GymUtils.isPositive(age)){
            System.out.println("Invalid age.");
            return;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personal Information" + "\n" + "Firstname: " + firstname + "\n" + "Lastname: " + lastname
                + "\n" + "Age: " + age;
    }
}
