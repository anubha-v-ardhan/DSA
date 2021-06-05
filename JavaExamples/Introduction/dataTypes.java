package JavaExamples.Introduction;

public class dataTypes {
    public static void main(String[] args) {
        
        //As the name suggests, data types specify the type of data that can be stored inside variables in Java.

        //There are 8 data types predefined in Java programming language, known as primitive data types.
        // In addition to primitive data types, there are also referenced types (object type).

        //BOOLEAN TYPE
        boolean flag = true;
        System.out.println(flag);    // prints true

        //BYTE TYPE
        //values from -128 to 127 (8-bit signed two's complement integer).
        //default value = 0
        byte range;
        range = 124;
        System.out.println(range);    // prints 124

        //SHORT TYPE
        //values from -32768 to 32767 (16-bit signed two's complement integer).
        //default value = 0
        short temperature;
        temperature = -200;
        System.out.println(temperature);  // prints -200

        //INT TYPE
        //values from -2^31 to 2^31-1 (32-bit signed two's complement integer).
        //If you are using Java 8 or later, you can use an unsigned 32-bit integer. This will have a minimum value of 0 and a maximum value of 232-1.
        //default value = 0
        int range = -4250000;
        System.out.println(range);  // print -4250000

        //LONG TYPE
        //values from -2^63 to 2^63-1 (64-bit signed two's complement integer).
        //If you are using Java 8 or later, you can use an unsigned 64-bit integer with a minimum value of 0 and a maximum value of 264-1.
        //default value = 0
        long range = -42332200000L;
        System.out.println(range);    // prints -42332200000

        //DOUBLE TYPE
        //The double data type is a double-precision 64-bit floating-point.
        //It should never be used for precise values such as currency.
        //Default value: 0.0 (0.0d)
        double number = -42.3;
        System.out.println(number);  // prints -42.3

        //FLOAT TYPE
        //The float data type is a single-precision 32-bit floating-point
        //It should never be used for precise values such as currency.
        //Default value: 0.0 (0.0f)
        float number = -42.3f;
        System.out.println(number);  // prints -42.3
        //-42.3f instead of -42.3in the above program. It's because -42.3 is a double literal.
        //To tell the compiler to treat -42.3 as float rather than double, you need to use f or F

        //CHAR TYPE
        //16-bit Unicode character.
        //The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'
        //Default value: '\u0000'
        char letter = '\u0051';
        System.out.println(letter);  // prints Q
        //Here, the Unicode value of Q is \u0051. Hence, we get Q as the output.
        char letter1 = '9';
        System.out.println(letter1);  // prints 9   
        char letter2 = 65;
        System.out.println(letter2);  // prints A (ASCII bacause without '')
        
        //STRING TYPE
        //Java also provides support for character strings via java.lang.String class. Strings in Java are not primitive types. Instead, they are objects.
        String myString = "Java Programming";
        //myString is an object of the String class.
    

    }
}
