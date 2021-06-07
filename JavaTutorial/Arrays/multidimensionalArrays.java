package JavaTutorial.Arrays;

public class multidimensionalArray {
  public static void main(String[] args) {

    int[][] a = new int[3][4]; // 2D array

    // A multidimensional array is an array of arrays. Each element of a multidimensional array is an array itself
    // Remember, Java uses zero-based indexing, that is, indexing of arrays in Java starts with 0 and not 1.

    String[][][] data = new String[3][4][2]; // 3D Array

    //--------------------------------------------------------------------------

    // INITIALIZE 2D ARRAY

    int[][] a = {
      {1, 2, 3},
      {4, 5, 6, 9},
      {7},
    };

    // unlike C/C++, each row of the multidimensional array in Java can be of different lengths.

    // eg-

    // create a 2d array
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6, 9},
            {7},
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);

        // here we using length attribute to find length of each row

    //-------------------------------------------------------------------------

    // Q - Print all elements of 2d array Using Loop

    int[][] a = {
            {1, -2, 3},
            {-4, -5, 6, 9},
            {7},
        };

        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }

    // OR using for-each loop

    // create a 2d array
        int[][] a = {
            {1, -2, 3},
            {-4, -5, 6, 9},
            {7},
        };

        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }

    //--------------------------------------------------------------------------

    // 3D Array initialization

    // test is a 3d array
    int[][][] test = {
            {
              {1, -2, 3},
              {2, 3, 4}
            },
            {
              {-4, -5, 6, 9},
              {1},
              {2, 3}
            }
    };

    // 3d array is an array of 2d arrays. The rows of a 3d array can also vary in length just like in a 2d array.

    //--------------------------------------------------------------------------

    // create a 3d array
        int[][][] test = {
            {
              {1, -2, 3},
              {2, 3, 4}
            },
            {
              {-4, -5, 6, 9},
              {1},
              {2, 3}
            }
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }


  }
}
