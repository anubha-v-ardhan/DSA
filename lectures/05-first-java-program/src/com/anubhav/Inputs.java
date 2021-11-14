package com.anubhav;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your roll number: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);


        int millions = 1_000_000; //this is how to enter large numbers and keep them human readable as , are not allowed

        String word = input.next(); // inputs a word (till space)
        System.out.println(word);

        String line = input.nextLine(); // inputs whole line
        System.out.println(line);

        float marks = input.nextFloat();
        System.out.println(marks); // it rounds large decimal numbers, this is floating point error

    }

}
