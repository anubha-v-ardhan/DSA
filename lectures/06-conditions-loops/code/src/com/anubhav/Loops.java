package com.anubhav;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Q: print numbers from 1 to 5

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);      // BAD

        // or just loop

        // FOR LOOP
        /*
            Syntax

            for (intialisation; condition; increment/decrement) {
                // body
            }
         */
        for (int num = 1; num <= 5; num++) { // num++ -> num += 1 -> num = num + 1
            System.out.println(num);
        }

        // Q: print numbers from 1 to n

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        // WHILE LOOPS

        /*
            Syntax:
            while (condition) {
                // body
            }
         */

        int n1 = 1;
        while (n1 < 5) {
            System.out.println(n1);
            n1 += 1;
        }

        // while loop -> when we know how many times the loop will run
        // for loop -> when we know how many times the loop will run

        // DO WHILE LOOP

        /*
            Syntax
            do {
                // body
            } while (condition)
         */

        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a <= 5);

        // do while loop, the loop is going to execute atleast one time no matter what, for example:

        do {
            System.out.println("Hello World");
        } while (a != 1);


    }
}
