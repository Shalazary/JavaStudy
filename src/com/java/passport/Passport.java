package com.java.passport;

abstract public class Passport {
    public int number;

    public Passport(int number) {
        this.number = number;
    }

    abstract public boolean CheckedValid(Passport P);
}



