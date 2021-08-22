package com.java;


import com.java.admin.AdminPoint;
import com.java.employer.Employer;
import com.java.passport.PassportRussia.PassportRussia;
import com.java.passport.PassportUSA.PassportUSA;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Employer usa = new Employer("John", 54, "USA",
                new PassportUSA(
                        852896333,
                        LocalDate.of(2000, 5, 12),
                        LocalDate.of(2010, 7, 24)), 9000, "Builder");
        Employer rus = new Employer("Kirill", 21, "Russia", new PassportUSA(
                852896333,
                LocalDate.of(2000, 5, 12),
                LocalDate.of(2010, 7, 24)), 9000, "Builder");

        AdminPoint.Check(usa, rus);
    }
}
