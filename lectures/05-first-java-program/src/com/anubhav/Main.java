package com.anubhav;
    // package is the folder in which our java file lies, we can make other packages such as kunal in this case
    // . is just used for subfolder anubhav and kunal are subfolders in com folder, hence com.anubhav and com.kunal

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    // psvm
        System.out.println("Hello World"); //sout

        // hold control and click on above (System, out and println) to see how they do what they do. these are written by creators of java to make our lives easier

        /*
            System is class created by java creators which provide all nice functions like println
            out is variable name of PrintStream
        */

        System.out.print("Hello World "); // doesn't add new line
        System.out.println(234); // print numbers

        Scanner inputInt = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner inputLine = new Scanner(System.in);

        System.out.println(inputInt.nextInt()); // input integer and prints it
        System.out.println(input.next()); //input String (till it finds space) and prints it [try input like Hi, how are you]
        System.out.println(inputLine.nextLine()); //input and prints whole line

    }
}
