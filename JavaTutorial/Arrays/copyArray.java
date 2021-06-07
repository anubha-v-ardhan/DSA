package JavaTutorial.Arrays;

public class copyArray {
  public static void main(String[] args) {

    // Copying Arrays Using Assignment Operator

    int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }

    // we have used the assignment operator (=) to copy an array named numbers to another array named positiveNumbers.
    // If we change elements of one array, corresponding elements of the other arrays also change.
    //      eg-

    int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        // change value of first array
        numbers[0] = -1;

        // printing the second array
        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }

    // Output = -1, 2, 3, 4, 5, 6,
    // It's because both arrays refer to the same array object. This is because of the shallow copy.
    // to make new array objects while copying the arrays, we need deep copy rather than a shallow copy.

    //--------------------------------------------------------------------------

    // Using Looping Construct to Copy Arrays

    int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }

         // converting array to string
        System.out.println(Arrays.toString(destination));

    // we have used the for loop to iterate through each element of the source array. In each iteration, we are copying elements from the source array to the destination array.
    // Here, the source and destination array refer to different objects (deep copy).
    // if elements of one array are changed, corresponding elements of another array is unchanged.
    // System.out.println(Arrays.toString(destination)); -> toString() method is used to convert an array to a String

    //--------------------------------------------------------------------------

    // Copying Arrays Using arraycopy() method

    // In Java, the System class contains a method named arraycopy() to copy arrays.
    // This method is a better approach to copy arrays than the above two.
    // The arraycopy() method allows you to copy a specified portion of the source array to the destination array.

    arraycopy(Object src, int srcPos,Object dest, int destPos, int length)

    /*
    src - source array you want to copy
    srcPos - starting position (index) in the source array
    dest - destination array where elements will be copied from the source
    destPos - starting position (index) in the destination array
    length - number of elements to copy
    */

    

  }
}
