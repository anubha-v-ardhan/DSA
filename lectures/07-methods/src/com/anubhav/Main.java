package com.anubhav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        In Java, we call functions as methods because when we have a function in a class, we call it a method and in
        Java, we put everything in a class.
        */

        // Q: Take input of two numbers and print the sum


        // EARLIER WAY
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " + sum);

        /*
        WHY METHODS?
            If we are asked to do the above 100 times, we will have to copy this 100 time, that would be dry
            In programming world, dry means repeating the code (so copy-pasting 100 times is not good).
            Here comes methods and functions
        */

        sum1(); // void function call

        int ans = sum2(); // storing returning int value returning from function sum2()
        System.out.println(ans);
    }

    /*
    SYNTAX

        return-type name (arguments) {
            // body
            return statement;
        }
    */

    /*
    RETURN TYPE
        When we call the function, what is the value if function call will be?
        When the function finishes execution, sum() [line 34] is going to have some value.
        The value is going to be whatever we return in the function.
        If we don't want to return anything, we write void as return type.
    */

    static /* anything we want to use in static (main is static) has also to be static */ void /* We are not returning anything */sum1() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    // FUNCTION RETURNING INT VALUE FOR sum
    static int /* returning int value sum*/ sum2() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;             // return statement means this function is now over here

        // System.out.println("This will never execute"); // uncomment to see error -> unreachable statement as this is below return statement
    }

    /*
    HOW IT WORKS

        We know main() is the first function to run, inside main(), we have sum() so it runs sum() and then continues
        running main()
    */
}
