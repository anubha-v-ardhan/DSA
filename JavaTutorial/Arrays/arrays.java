package JavaTutorial.Arrays;

public class arrays {
  public static void main(String[] args) {

    // if we want to store the names of 100 people then we can create an array of the string type that can store 100 names.
    String[] array = new String[100];
    // he above array cannot store more than 100 names. The number of values in a Java array is always fixed.

    // DECLARE AN ARRAY
    dataType[] arrayName;

    // eg-
    double[] data; // declare an array
    data = new double[10]; //allocate memory
    // Here, the array can store 10 elements. We can also say that the size or length of the array is 10.

    // OR, in one single statement
    double[] data = new double[10];

    // declare and initialize and array
    int[] age = {12, 4, 5, 2, 5}; // created an array named age and initialized it with the values inside the curly brackets.

    // Array indices always start from 0. That is, the first element of an array is at index 0.
    // If the size of an array is n, then the last element of the array will be at index n-1.

    // access array elements
    array[index]

    //--------------------------------------------------------------------------

    // create an array
   int[] age = {12, 4, 5, 2, 5};

   // access each array elements
   System.out.println("Accessing Elements of Array:");
   System.out.println("First Element: " + age[0]);
   System.out.println("Second Element: " + age[1]);
   System.out.println("Third Element: " + age[2]);
   System.out.println("Fourth Element: " + age[3]);
   System.out.println("Fifth Element: " + age[4]);

   //---------------------------------------------------------------------------

   // LOOPING THROUGH ARRAY ELEMENTS

   // create an array
   int[] age = {12, 4, 5};

   // loop through the array
   // using for loop
   System.out.println("Using for Loop:");
   for(int i = 0; i < age.length; i++) {
     System.out.println(age[i]);
   }

   //NOTICE age.length, here we are using the length property of Arrays to get its size

   //---------------------------------------------------------------------------

   // USING FOR-EACH LOOP

   // create an array
   int[] age = {12, 4, 5};

   // loop through the array
   // using for loop
   System.out.println("Using for-each Loop:");
   for(int a : age) {
     System.out.println(a);
   }

   //---------------------------------------------------------------------------

   // Q - Compute Sum and Average of Array Elements

   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
   int sum = 0;
   Double average;

   // access all elements using for each loop
   // add each element in sum
   for (int number: numbers) { // using for-each loop to itterate in array is better
     sum += number;
   }

   // get the total number of elements
   int arrayLength = numbers.length; // using numbers.length to find size of array = no. of elements required to find Average

   // calculate the average
   // convert the average from int to double
   average =  ((double)sum / (double)arrayLength); // converting int to double (TypeCasting)

   System.out.println("Sum = " + sum);
   System.out.println("Average = " + average);

   //---------------------------------------------------------------------------

   // MULTIDIMENSIONAL Arrays

   double[][] matrix = {{1.2, 4.3, 4.0},
      {4.1, -1.1}
    };
    

  }
}
