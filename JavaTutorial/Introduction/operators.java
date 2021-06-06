package JavaExamples.Introduction;

public class operators {
    public static void main(String[] args) {
        
        //Operators are symbols that perform opearations on variables and values.

        //ARITHMETIC OPERATOR
        // declare variables
        int a = 12, b = 5;
        // addition operator
        System.out.println("a + b = " + (a + b));
        // subtraction operator
        System.out.println("a - b = " + (a - b));
        // multiplication operator
        System.out.println("a * b = " + (a * b));
        // division operator
        System.out.println("a / b = " + (a / b)); //if done on two integer, the result will always be integer
        // modulo operator
        System.out.println("a % b = " + (a % b)); //remainder after division

        //ASSIGNMENT OPERATORS
        // create variables
        int a = 4;
        int var;
        // assign value using =
        var = a;
        System.out.println("var using =: " + var);
        // assign value using =+
        var += a;
        System.out.println("var using +=: " + var);
        // assign value using =*
        var *= a;
        System.out.println("var using *=: " + var);

        //RELATIONAL OPERATOR
        // create variables
        int a = 7, b = 11;
        // value of a and b
        System.out.println("a is " + a + " and b is " + b);
        // == operator
        System.out.println(a == b);  // false
        // != operator
        System.out.println(a != b);  // true
        // > operator
        System.out.println(a > b);  // false
        // < operator
        System.out.println(a < b);  // true
        // >= operator
        System.out.println(a >= b);  // false
        // <= operator
        System.out.println(a <= b);  // true

        //LOGICAL OPERATORS
        // && operator (AND)
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false
        // || operator (OR)
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false
        // ! operator (NOT)
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false

        //UNARY OPERATORS
        // declare variables
        int a = 12, b = 12;
        int result1, result2;
        // original value
        System.out.println("Value of a: " + a);
        // increment operator
        result1 = ++a;
        System.out.println("After increment: " + result1);
        System.out.println("Value of b: " + b);
        // decrement operator
        result2 = --b;
        System.out.println("After decrement: " + result2);

        //BITWISE OPERATORS
        //  ~	Bitwise Complement
        //  <<	Left Shift
        //  >>	Right Shift
        //  >>>	Unsigned Right Shift
        //  &	Bitwise AND
        //  ^	Bitwise exclusive OR

        //instanceof
        //The instanceof operator checks whether an object is an instanceof a particular class
        String str = "Programiz";
        boolean result;
        // checks if str is an instance of
        // the String class
        result = str instanceof String;
        System.out.println("Is str an object of String? " + result);

        //TERNARY OPERATOR
        //shorthand for the if-then-else statement
        int februaryDays = 29;
        String result;
        // ternary operator
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);

    }
}
