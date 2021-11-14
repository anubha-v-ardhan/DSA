package com.anubhav;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        /*
        FIBONACCI NUMBERS

        The sum of previous two numbers is the next number of the series
        a = 0
        b = 1
        n = 7
        0, 1, 2, 3, 5, 8, 13

        Q: Find the nth Fibonacci number

        PLAN:

        Since we know n, we'll can use for loop as we know the no. of times loop will run. (but in solution below let's use while)
                NOTE: while loop is also sometimes used to make code look cleaner

        Each iteration we will update the value if a and b

                             _______________
                            |   a   |   b   |       a -> previous index
                            |-------|-------|       b -> current index
                            |   0   |   1   |
                            |   1   | 0+1=2 |
                            |   2   | 1+2=3 |
                            |   3   | 2+3=5 |
                            |   5   | 3+5=8 |
                            |   8   | 5+8=13|
                            |_______|_______|

         We already have the first two numbers a=0 and b=1, so our loop will have to run 2 less times than n
         */

        // SOLUTION

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b += a;
            a = temp;
            count++;
        }

        System.out.println(b);

        // In future, we will see a better way of finding nth fibonacci number

    }
}
