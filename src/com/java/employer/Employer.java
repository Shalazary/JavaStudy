package com.java.employer;


import com.java.passport.Passport;
import com.java.person.Person;


public class Employer extends Person {

    private int salary;
    private String profession;

    public Employer(String name, int age, String country, Passport p, int salary, String profession) {
        super(name, age, country, p);
        this.salary = salary;
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
