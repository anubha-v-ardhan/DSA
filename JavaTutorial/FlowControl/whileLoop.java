package JavaTutorial.FlowControl;

public class whileLoop {
  public static void main(String[] args) {

    while (testExpression) {
    // body of loop
    }

    //----------------------------------------------------------

    // declare variables
    int i = 1, n = 5;

    // while loop from 1 to 5
    while(i <= n) {
      System.out.println(i);
      i++;
    }

    //-----------------------------------------------------------

    int sum = 0;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // take integer input from the user
    System.out.println("Enter a number");
    int number = input.nextInt();

    // while loop continues
    // until entered number is positive
    while (number >= 0) {
      // add only positive numbers
      sum += number;

      System.out.println("Enter a number");
      number = input.nextInt();
    }

    System.out.println("Sum = " + sum);
    input.close();

    //--------------------------------------------------------------

    // DO WHILE lOOP

    do {
    // body of loop
    } while(textExpression)

    //----------------------------------------------------------------

    int i = 1, n = 5;

    // do...while loop from 1 to 5
    do {
      System.out.println(i);
      i++;
    } while(i <= n);

    //-------------------------------------------------------------------

    int sum = 0;
    int number = 0;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // do...while loop continues
    // until entered number is positive
    do {
      // add only positive numbers
      sum += number;
      System.out.println("Enter a number");
      number = input.nextInt();
    } while(number >= 0);

    System.out.println("Sum = " + sum);
    input.close();

    //-------------------------------------------------------------------

    // INFINITE WHILE lOOP
    while(true){
    // body of loop
    }

    // INFINITE DO WHILE LOOP
    int count = 1;
    do {
       // body of loop
    } while(count == 1)

    //--------------------------------------------------------------------

    //The for loop is used when the number of iterations is known
    //while and do...while loops are generally used when the number of iterations is unknown

  }
}
