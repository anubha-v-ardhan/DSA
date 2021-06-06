import java.util.Scanner; //In order to use the object of Scanner, we need to import java.util.Scanner package.

package JavaExamples.Introduction;

public class inputOutput {
    public static void main(String[] args) {
        
        //OUTPUT

        System.out.println("Java programming is interesting.");

        //print() - It prints string inside the quotes.
        //println() - It prints string inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line.
        //printf() - It provides string formatting (similar to printf in C/C++ programming).

        Double number = -10.6;
        System.out.println(5);  // to display integers, variables and so on, we don't use quotation marks.
        System.out.println(number);

        //INPUT

        //import java.util.Scanner; (see 1st line of the code)

        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        // take input from the user
        int number = input.nextInt();

        // closing the scanner object
        input.close();

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);
    	
        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);
    	
        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);

    }
}
