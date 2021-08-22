package com.java.admin;

import com.java.employer.Employer;
import com.java.passport.Passport;
import com.java.person.Person;


public class AdminPoint {
    public static void Check(Person... emp) {
        for (Person employer : emp) {
            Passport pass = employer.getPass();
            if (pass == null) {
                System.out.println("    ");
                continue;
            }
            boolean result = pass.CheckedValid(pass);
            System.out.println(result);
        }
    }
}
