package com.anubhav;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        /*
        When one type of data is assigned to another type of variable, an automatic type conversion takes place if the following conditions are met:
            1.  The two types should be compatible.
            2.  Destination type should be greater than the source type. (Float > Integer as we can add decimal in float but int is only integer values)
                    if you are asking for integer and giving float -> not work
                    if you are asking for float and giving integer -> works
         */

        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        System.out.println(num1);

        // when we input an integer in above code, we see that it automatically converts it to float

        // TYPECASTING

        // so in order to do things like giving float value in int, we do narrowing conversion by typecasting
        int num2 = (int)(67.65f); // converts the float value 67.65 into integer and stores it in num2 variable of int type i.e just 67
        System.out.println(num2);

        // AUTOMATIC TYPE PROMOTION IN EXPRESSIONS

        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

        // in above code, we can't store 257 even after typecasting as the maximum value in byte can be 256
        // So, the value of b is coming out as 1, which is 257 % 256 (maximum no byte can store)

        // similarly,
        byte a1 = 40;
        byte b1 = 50;
        byte c1 = 100;
        int d1 = a1 * b1 / c1;
        System.out.println(d1);

        /*
         here, we get 20 which is the correct value
         but the result of intermediate term, a1 * b1 = 40 * 50 = 2000 exceeds maximum byte value of 256, how is the final answer still correct?

         To avoid this problem, Java is automatically promoting each variable to integer when it is evaluating that expression, so that it is able to store it
         That means a1 * b1 is being performed using integers
         */

        byte b2 = 50;
        // b2 = b2 * 2; // error

        // this is giving error even when b2 * 2 = 100 is within byte's range
        // it is because whenever we are doing expressions on bytes, it is being promoted to integers. so b2 is an integer now and can't be assigned to byte without typecasting (same reason we were not able to assign float to an integer)

        /*
        The above thingy is ofc not happening randomly, these are the rules Java follows for automatic promotion of types:
            1.  All the byte, short and char values are promoted to int
            2.  Any one of the operands is long, the whole operation is promoted to long
                                        is float, the whole operation is promoted ot float
                                        is double, the whole operation is promoted to double
         */

        System.out.println(3 * 5.6); // prints float value which shows everything got promoted to float


        int number = 'a';
        System.out.println(number); // This prints the ASCII value of a


        // Note
        System.out.println("नमस्ते"); // we can print नमस्ते in Java too because it follows unicode so we can print any character unicode has

        // summary code
        byte bx = 42;
        char cx = 'a';
        short sx = 1024;
        int ix = 50000;
        float fx = 5.67f;
        double dx = 0.1234;
        double result = (fx * bx) + (ix / cx) - (dx * sx);
        // float + int + double = double (biggest is double)
        System.out.println((fx * bx) + " " + (ix / cx) + " " + (dx * sx));
        System.out.println(result);



    }
}
