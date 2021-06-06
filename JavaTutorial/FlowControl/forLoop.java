package JavaTutorial.FlowControl;

public class forLoop {
	public static void main(String[] args) {

		for (initialExpression; testExpression; updateExpression) {
    // body of the loop
		}

		//--------------------------------------------------------

		int n = 5;
    // for loop
    for (int i = 1; i <= n; ++i) {
      System.out.println("Java is fun");
    }

		//---------------------------------------------------------

		int n = 5;
    // for loop
    for (int i = 1; i <= n; ++i) {
      System.out.println(i);
    }

		//----------------------------------------------------------

		int sum = 0;
		int n = 1000;

		// for loop
		for (int i = 1; i <= n; ++i) {
			// body inside for loop
			sum += i;     // sum = sum + i
		}

		System.out.println("Sum = " + sum);

		//------------------------------------------------------------

		//FOR EACH lOOP

		//The Java for loop has an alternative syntax that makes it easy to iterate through arrays and collections
		// create an array
    int[] numbers = {3, 7, 5, -5};

    // iterating through the array
    for (int number: numbers) {
       System.out.println(number);
    }

		//-----------------------------------------------------------------

		//INFINITE FOR lOOP
		int sum = 0;

    for (int i = 1; i <= 10; --i) {
        System.out.println("Hello");
    }

	}
}
