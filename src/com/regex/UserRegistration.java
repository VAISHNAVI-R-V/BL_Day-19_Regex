package com.regex;

/**
 * @purpose: Valid Last Name with first letter starting
 * with capital and has minimum 3 characters in it.
 */

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println(firstName("Shinchan"));
        System.out.println(firstName("Nohara"));
        System.out.println(lastName("Tarak"));
        System.out.println(lastName("Mehta"));
    }

    // validate first name
    public static boolean firstName(String firstName) {
        return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }

    // validate first name
    public static boolean lastName(String firstName) {
        return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
    }
}
