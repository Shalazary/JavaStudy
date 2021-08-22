package com.java.person;


import com.java.passport.Passport;

public abstract class Person{

    private String name;
    private int age;
    private String country;
    private Passport pass;

    public Person(String name, int age, String country, Passport pass) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.pass = pass;
    }

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Passport getPass() {
        return pass;
    }
}


