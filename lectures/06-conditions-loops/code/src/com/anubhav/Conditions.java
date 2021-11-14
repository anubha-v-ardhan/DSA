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

    }
}
