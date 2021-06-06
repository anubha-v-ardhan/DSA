package JavaTutorial.FlowControl;

public class breakStatement {
  public static void main(String[] args) {

    // for loop
    for (int i = 1; i <= 10; ++i) {

      // if the value of i is 5 the loop terminates
      if (i == 5) {
        break;
      }
      System.out.println(i);
    }

    //-------------------------------------------------------------------

    Double number, sum = 0.0;

      // create an object of Scanner
      Scanner input = new Scanner(System.in);

      while (true) {
          System.out.print("Enter a number: ");

          // takes double input from user
          number = input.nextDouble();

          // if number is negative the loop terminates
          if (number < 0.0) {
              break;
          }

         sum += number;
      }
      System.out.println("Sum = " + sum);

      //-----------------------------------------------------------------

      //In the case of nested loops, the break statement terminates the innermost loop.

      //LABELED BREAK STATEMENT

      while (testExpression) {
        // codes
         second:
         while (testExpression) {
            // codes
            while(testExpression) {
               // codes
               break second;
            }
         }
         // control jumps here
      }

      //-----------------------------------------------------------------------

      // the for loop is labeled as first
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {
                System.out.println("i = " + i + "; j = " +j);

                // the break statement breaks the first for loop
                if ( i == 2)
                    break first;
            }
        }


        //The break statement is also used to terminate cases inside the switch statement.

  }
}
