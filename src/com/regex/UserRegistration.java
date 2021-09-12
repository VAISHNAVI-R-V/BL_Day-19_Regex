package com.regex;

/**
 * @purpose: Check valid password
 * Rule 1: minimum 8 characters.
 * Rule 2: should contain at least 1 upper case character.
 * Rule 3: should have at least 1 numeric number.
 */

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println(firstName("Shinchan"));
        System.out.println(firstName("Nohara"));

        System.out.println(lastName("Tarak"));
        System.out.println(lastName("Mehta"));

        email();
        phoneNumber();
        password();
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

    //validate given phone number
    public static void phoneNumber() {
        String phone = "91 9919819801";
        String regex = "[0-9]{2}[\s][0-9]{10}";
        boolean result = phone.matches(regex);
        if (result) {
            System.out.println("Given phone number is valid");
        } else {
            System.out.println("Given phone number is not valid");
        }
    }

    //validate given password
    public static void password() {
        String password = "acd$1X23";
        String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}";
       // String regex = "(?=.*[A-Z])[A-Za-z0-9@_#$%!]{8,}";
        boolean result = password.matches(regex);
        if (result) {
            System.out.println("Given password is valid");
        } else {
            System.out.println("Given password is not valid");
        }
    }
}
