package com.anubhav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // IF STATEMENT APPROACH

        /*
        if (fruit == "mango")) {  --> We are not using this and using .equals() instead because == checks ref only

        }                                          a ---------------> mango         // == gives true
                                                                        |
                                                   b -------------------|

                                                   a ----------------> mango        // == gives false
                                                   b ----------------> mango

                           But .equals() gives true in both the cases as it only checks the value of String
        */

        if (fruit.equals("mango")) {
            System.out.println("King if fruit");
        }

        if (fruit.equals("apple")) {
            System.out.println("A sweet red fruit");
        }

        // the code here doesn't look nice, we can use switch cases here

        /*
                                    SWITCH CASE

         Syntax

         switch (expression) {

            // cases
            case one:
                // do something
                break;
                                          ---> This syntax is a bit old, we now have a new way of doing switch as done below
            case teo:                                                   (enhanced switch)
                // do something
                break;

            default:
                // do something
         }

         NOTE:
            1.  cases have to be same type as expressions, must be a constant or literal
            2.  duplicate case values are not allowed
            3.  break is used to terminate the sequence
            4.  if break is not used, it will continue to next case
            5.  default will execute if none of the other cases does
            6.  if default is not at the end, put break after it
         */

        switch (fruit) {                        // enhanced switch
            case "Mango" -> System.out.println("King if fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grape" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }

        int day = in.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }

        switch (day) {              // enhanced switch when we want to not include break in one or more statements
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}
