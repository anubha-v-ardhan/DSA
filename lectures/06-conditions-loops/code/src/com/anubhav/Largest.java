package com.anubhav;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of 3 numbers

        int m = a;
        if (b > m) {
            m = b;
        }
        if (c > m) {
            m = c;
        }

        System.out.println(m);

            // alternate method
        int maximum = 0;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }
        if (c > maximum) {
            maximum = c;
        }
        System.out.println(maximum);

            // alternate method using math class
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

            // or we can simply do this too
        System.out.println(Math.max(30, 40));

    }
}
