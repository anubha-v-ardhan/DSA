package JavaExamples.FlowControl;

public class ifElse {
    public static void main(String[] args) {
        
        /*if statement
        if...else statement
        if...else if...else statement
        Nested if...else statement */

        //IF STATEMENT

        int number = 10;
        // checks if number is greater than 0
        if (number > 0) {
          System.out.println("The number is positive.");
        }
        System.out.println("Statement outside if block");

        //IF WITH STRING

        // create a string variable
        String language = "Java";
        // if statement
        if (language == "Java") {
          System.out.println("Best Programming Language");
        }

        //IF ELSE STATEMENT

        int number = 10;
        // checks if number is greater than 0
        if (number > 0) {
          System.out.println("The number is positive.");
        }
        // execute this block
        // if number is not greater than 0
        else {
          System.out.println("The number is not positive.");
        }
        System.out.println("Statement outside if...else block");

        //IF ELSE IF STATEMENT

        int number = 0;
        // checks if number is greater than 0
        if (number > 0) {
          System.out.println("The number is positive.");
        }
        // checks if number is less than 0
        else if (number < 0) {
          System.out.println("The number is negative.");
        }
        // if both condition is false
        else {
          System.out.println("The number is 0.");
        }

        //IF ELSE IF STATEMENT CAN ALSO BE DONE USING TERNARY OPERATOR

        //NESTED IF ELSE STATEMENT

        // declaring double type variables
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
        // checks if n1 is greater than or equal to n2
        if (n1 >= n2) {
          // if...else statement inside the if block
          // checks if n1 is greater than or equal to n3
          if (n1 >= n3) {
            largest = n1;
          }
          else {
            largest = n3;
          }
        } else {
          // if..else statement inside else block
          // checks if n2 is greater than or equal to n3
          if (n2 >= n3) {
            largest = n2;
          }
          else {
            largest = n3;
          }
        }
        System.out.println("Largest Number: " + largest);

    }
}
