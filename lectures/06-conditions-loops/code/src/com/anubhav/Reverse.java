package com.anubhav;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        /*
        Let's say we have a number 23579, now we have to reverse this number i.e. 97532

        PLAN:

        Take the remainder(units digit number) everytime using n % 10 and add it to the ans

                        Iterations:
                             _______________________________
                            |        ans        |     n     |
                            |-------------------|-----------|
                            |                   |   23597   |
                            |   7               |   2359    |
                            |   7*10+9=79       |   235     |
                            |   79*10+5=795     |   23      |
                            |   795*10+3=7953   |   2       |
                            |   7953*10+2=79532 |           |
                             -------------------------------

         */

        // SOLUTION:

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }

        System.out.println(ans);

    }
}
