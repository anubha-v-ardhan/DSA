package JavaTutorial.FlowControl;

public class continueStatement {
  public static void main(String[] args) {

    // The continue statement skips the current iteration of a loop (for, while, do...while, etc).

    // for loop
    for (int i = 1; i <= 10; ++i) {

      // if value of i is between 4 and 9
      // continue is executed
      if (i > 4 && i < 9) {
        continue;
      }
      System.out.println(i);
    }

    //-------------------------------------------------------------------------

    Double number, sum = 0.0;
    // create an object of Scanner
    Scanner input = new Scanner(System.in);

    for (int i = 1; i < 6; ++i) {
      System.out.print("Enter number " + i + " : ");
      // takes input from the user
      number = input.nextDouble();

      // if number is negative
      // continue statement is executed
      if (number <= 0.0) {
        continue;
      }

      sum += number;
    }
    System.out.println("Sum = " + sum);
    input.close();

    //--------------------------------------------------------------------------

    // IN NESTED LOOPS

    int i = 1, j = 1;

    // outer loop
    while (i <= 3) {

      System.out.println("Outer Loop: " + i);

      // inner loop
      while(j <= 3) {

        if(j == 2) {
          j++;
          continue;
        }

        System.out.println("Inner Loop: " + j);
        j++;
      }
      i++;
    }

    //-------------------------------------------------------------------------

    // LABELED CONTINUE STATEMENT

    // outer loop is labeled as first
    first:
    for (int i = 1; i < 6; ++i) {

      // inner loop
      for (int j = 1; j < 5; ++j) {
        if (i == 3 || j == 2)

          // skips the current iteration of outer loop
          continue first;
        System.out.println("i = " + i + "; j = " + j);
      }
    }

    //---------------------------------------------------------------------------

    // GOOD HABITS

    //The use of labeled continue is often discouraged as it makes your code
    //hard to understand. If you are in a situation where you have to use
    //labeled continue, refactor your code and try to solve it in a different
    //way to make it more readable.

  }
}
