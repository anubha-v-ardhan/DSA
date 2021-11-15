package com.anubhav;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();


        // better way to write
        switch (empID) {
            case 1 -> System.out.println("Anubhav Vardhan");
            case 2 -> System.out.println("Hrishab");
            case 3 -> {                                     // Note how we did nested switch in enhanced switch statement
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department found");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

    }
}
