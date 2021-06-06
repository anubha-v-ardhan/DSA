package JavaTutorial.FlowControl;

public class forEachLoop {
  public static void main(String[] args) {

    for(dataType item : array) {
    ...
    }

    //------------------------------------------------------------

    // create an array
    int[] numbers = {3, 9, 5, -5};

    // for each loop
    for (int number: numbers) {
      System.out.println(number);
    }

    //---------------------------------------------------------------

    // an array of numbers
   int[] numbers = {3, 4, 5, -5, 0, 12};
   int sum = 0;

   // iterating through each element of the array
   for (int number: numbers) {
     sum += number;
   }

   System.out.println("Sum = " + sum);

    //for-each loop is preferred over the for loop when working with arrays and collections.

  }
}
