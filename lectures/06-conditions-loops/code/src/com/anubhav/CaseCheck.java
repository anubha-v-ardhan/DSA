package com.anubhav;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // There is no such thing as in.nextChar(), so we will have to take String input and take first letter of it

        // char ch = in.next().trim().charAt(0); <-- this explained below

        /*
        in.next() -> just prints the next word
        trim() -> remove spaces before the word
        charAt() -> prints the character at the index given
         */

        /* // [uncomment to use]

        String word = "     hello";
        System.out.println(word.trim());        // prints hello removing the spaces from word
        System.out.println(in.next());          // asks for input and just prints that
        System.out.println(in.next().trim());   // asks for input and remove extra spaces and prints it
        System.out.println(word.charAt(6));     // prints character at 6th index in the String word i.e. e
        */

        // charAt() returns a char type variable


        // CHECKING CASE OF CHARACTERS

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }


    }
}
