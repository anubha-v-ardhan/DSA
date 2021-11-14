package com.anubhav;

public class Conditions {
    public static void main(String[] args) {

        /*
            Syntax of if statement
            if (boolean expression) {
                // body
            } else {
                // do this
            }
        */

        int salary = 25400;
        if (salary > 10000)  {
            salary += 2000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);

        // multiple if-else statements

        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);

        int a = 10;
        int b = 20;

        if (a == 10 && b == 20) {                               // AND operator is used when both the conditions need to be true
            System.out.println("Hello World!");
        }

        if (a == 40 || b == 20) {                               // OR operator is used when one of them need to be true
            System.out.println("Hello World!");
        }

        if (a != 35) {                                          // NOT EQUAL TO
            System.out.println("Hello World!");
        }



    }
}
