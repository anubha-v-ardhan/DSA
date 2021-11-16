package com.anubhav;

public class PassProblem {
    public static void main(String[] args) {

        // None of the below code is working as intended, we have to understand how passing works to get this
        // Internal working of pass is explained in PassingExample.java and video 7, 29:39

        int a = 10;
        int b = 20;

        /*
        // swap numbers code
        int temp = a;
        a = b;
        b = temp;
        */

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Anubhav Vardhan";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "Hrishab Kishore";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
