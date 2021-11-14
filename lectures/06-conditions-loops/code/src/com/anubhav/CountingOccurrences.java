package com.anubhav;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {

        /*
        Let's say we have a number 1385757579, we have to find the number of times a digit (let's say 7) occurs
        Here, the digit 7 is occurring 3 times

        PLAN 1 (bad):

            Convert the number in string and then iterate through it

        PLAN 2 (good):

            When we take remainder of any number by 10, we get the unit place digit
                    Eg: 1389 % 10 = 9

                        n % 10 = unit place digit

            Similarly, dividing by 10 removes the unit place digit
                    Eg: 1389 / 10 = 138
         */

        // Q: Find the no. of times 5 comes in the input number

        // SOLUTION: (Plan 2)

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n /= 10;
        }

        System.out.println(count);

    }
}
