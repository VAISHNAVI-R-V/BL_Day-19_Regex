package com.regex;

/**
 * @purpose: Check valid email
 * e.g: abc.xyz@bl.co.in
 */

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println(firstName("Shinchan"));
        System.out.println(firstName("Nohara"));

        System.out.println(lastName("Tarak"));
        System.out.println(lastName("Mehta"));

        email();
    }

    // validate first name
    public static boolean firstName(String firstName) {
        return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }

    // validate first name
    public static boolean lastName(String firstName) {
        return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }

    //validate given email
    public static void email() {
        String email = "abc.xyz@bl.co.in";
        String regex = "^[a-z]{3}[a-zA-Z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.][a-z]*$";
        boolean result = email.matches(regex);
        if (result) {
            System.out.println("Given email-id is valid");
        } else {
            System.out.println("Given email-id is not valid");
        }
    }
}
