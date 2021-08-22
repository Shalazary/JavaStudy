package com.java.passport.PassportRussia;

import com.java.passport.Passport;

import java.time.LocalDate;

public class PassportRussia extends Passport {
    int seria;

    public PassportRussia(int number, int seria) {
        super(number);
        this.seria = seria;
    }

    public boolean CheckedValid(Passport P) {
        boolean isNumberValid = number > 111111 && number < 999999 && Integer.toString(number).length() == 6;
        boolean isSeriaValid = seria >= 1950 && seria <= 2050 && Integer.toString(seria).length() == 4;

        return isNumberValid && isSeriaValid;
    }
}


