package com.anubhav;

import java.util.Scanner;

public class ParameterString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String naam = in.nextLine();
        String personalized = greet(naam);
        System.out.println(personalized);
    }

    private static String greet(String name) {
        String message = "Hello " + name + "!";
        return message;
    }
}
