package JavaExamples.Introduction;

public class variables {
    public static void main(String[] args) {
        
        int speedLimit = 80; //create variable in Java
        //OR
        int speed;  
        speed = 80;

        //Java is a statically-typed language. It means that all variables must be declared before they can be used.

        speedLimit = 90; //change values of variables
        speed = 70;

        //Rules of naming Variables
        //Java is case sensitive. Hence, age and AGE are two different variables
        //Variables must start with either a letter or an underscore, _ or a dollar, $ sign
        //Variable names cannot start with numbers
        //Variable names can't use whitespace

        //Good habits
        //If we need to use variable names having more than one word, use all lowercase letters for the first word and capitalize the first letter of each subsequent word. For example, myAge
        //When creating variables, choose a name that makes sense. For example, score, number, level makes more sense than variable names such as s, n, and l
        //If you choose one-word variable names, use all lowercase letters. For example, it's better to use speed rather than SPEED, or sPEED

        //There are 4 types of variables in Java
        //Instance Variables (Non-Static Fields)
        //Class Variables (Static Fields)
        //Local Variables
        //Parameters

        //Java Literals
        //Literals are data used for representing fixed values

        int a = 1;
        float b = 2.5F;
        char c = 'F';  //Here, 1, 2.5, and 'F' are literals.

        //Types of Literals

        //BOOLEAN LITERALS
        boolean flag1 = false;
        boolean flag2 = true; //(false and true)

        //INTEGER LITERALS
        // binary
        int binaryNumber = 0b10010; //base 2
        // octal 
        int octalNumber = 027; //base 8
        // decimal
        int decNumber = 34; //base 10
        // hexadecimal 
        int hexNumber = 0x2F; // 0x represents hexadecimal (base 16)
        // binary
        int binNumber = 0b10010; // 0b represents binary

        //FLOATING POINT LITERALS
        //A floating-point literal is a numeric literal that has either a fractional form or an exponential form
        double myDouble = 3.4;
        float myFloat = 3.4F;
        // 3.445*10^2
        double myDoubleScientific = 3.445e2;
        System.out.println(myDouble);  // prints 3.4
        System.out.println(myFloat);    // prints 3.4
        System.out.println(myDoubleScientific);   // prints 344.5

        //CHARACTER LITERALS
        //Character literals are unicode character enclosed inside single quotes
        char letter = 'a';
        //We can also use escape sequences as character literals. For example, \b (backspace), \t (tab), \n (new line), etc.

        //STRING LITERALS
        //A string literal is a sequence of characters enclosed inside double-quotes
        String str1 = "Java Programming";
        String str2 = "Anubhav";
    }

}
