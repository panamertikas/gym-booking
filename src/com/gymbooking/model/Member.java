package com.gymbooking.model;

import com.gymbooking.util.GymUtils;

public class Member extends Person{


    private String mail;



    // Default and overloaded constructors
    public Member() {}

    public Member(String firstname, String lastname, String mail, int age) {
        super(firstname, lastname, age);
        setMail(mail);

    }

    /**
     * Static factory method to create a new Member instance.
     */
    public static Member of(String firstname, String lastname, String mail, int age) {
        return new Member(firstname, lastname, mail, age);
    }

    @Override
    public String getRole() {
        return "Member";
    }

    // Getters - Setters


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (GymUtils.isNullOrEmpty(mail)) {
            System.out.println("Invalid mail");
            return;
        }
        this.mail = mail;
    }



//    public void printInfo() {
//        System.out.println("Firstname: " + firstname + "\n" + "Lastname: " + lastname + "\n" +
//                "E-mail : " + mail + "\n" + "Age: " + age + "\n" );
//    }

    @Override
    public String toString() {
        return "Firstname: " + getFirstname() + "\n" + "Lastname: " + getLastname() + "\n" +
                "E-mail : " + mail + "\n" + "Age: " + getAge() + "\n" ;
    }

    public static class Builder {
        private String firstname;
        private String lastname;
        private String mail;
        private int age;

        public Builder(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }

        public Builder age (int age) {
            this.age =age;
            return this;
        }

        public Member build() {
            return new Member(firstname, lastname, mail, age);
        }
    }




}
