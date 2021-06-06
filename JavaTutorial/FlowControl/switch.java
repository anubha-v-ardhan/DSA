package JavaTutorial.switch;

public class switch {
	public static void main(String[] args) {

		switch (expression) {

	    case value1:
		    // code
		    break;
	  
	    case value2:
		    // code
		    break;
	  
	    ...
	    ...
	  
	    default:
	    	// default statements
	    }

	    // EXAMPLE

	    int number = 44;
	    String size;

	    // switch statement to check size
	    switch (number) {

	      case 29:
	        size = "Small";
	        break;

	      case 42:
	        size = "Medium";
	        break;

	      // match the value of week
	      case 44:
	        size = "Large";
	        break;

	      case 48:
	        size = "Extra Large";
	        break;
	      
	      default:
	        size = "Unknown";
	        break;

	    }
	    System.out.println("Size: " + size);

	    //The break statement is used to terminate the switch-case statement. If break is not used, all the cases after the matching case are also executed
	    //The switch statement also includes an optional default case. It is executed when the expression doesn't match any of the cases

	    //the switch statement only works with
	    // primitive data types: byte, int, short, char etc
	    // enumerated types
	    // String class
	    // Wrapper class: Character, Byte, Short and Integer

	}
}