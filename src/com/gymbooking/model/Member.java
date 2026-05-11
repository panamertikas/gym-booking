package com.gymbooking.model;

public class Member {

    private String firstname;
    private String lastname;
    private String mail;
    private int age;


    // Default and overloaded constructors
    public Member() {}

    public Member(String firstname, String lastname, String mail, int age) {
        setFirstname(firstname);
        setLastname(lastname);
        setMail(mail);
        setAge(age);
    }

    // Getters - Setters

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname (String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age.");
            return;
        }
        this.age = age;
    }

//    public void printInfo() {
//        System.out.println("Firstname: " + firstname + "\n" + "Lastname: " + lastname + "\n" +
//                "E-mail : " + mail + "\n" + "Age: " + age + "\n" );
//    }

    @Override
    public String toString() {
        return "Firstname: " + firstname + "\n" + "Lastname: " + lastname + "\n" +
                "E-mail : " + mail + "\n" + "Age: " + age + "\n" ;
    }
}
