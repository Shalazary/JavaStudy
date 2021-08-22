package com.java.passport.PassportUSA;

import com.java.passport.Passport;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;
import java.util.regex.*;


public class PassportUSA extends Passport {
    LocalDate startRegistration;
    LocalDate endRegistration;

    public PassportUSA(int number, LocalDate startRegistration, LocalDate endRegistration) {
        super(number);
        this.startRegistration = startRegistration;
        this.endRegistration = endRegistration;
    }

    public boolean CheckedValid(Passport P) {
        LocalDate now = LocalDate.now();

        // Разница в днях между началом действия паспорта и концом;
        int daysLeft = (int) ChronoUnit.DAYS.between(now, endRegistration);

        String regex9Numbers = "\\d{9}";

        return (daysLeft > 0) && (Pattern.matches(regex9Numbers, Integer.toString(number)));
    }
}
