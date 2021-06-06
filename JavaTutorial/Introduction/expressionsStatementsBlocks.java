package JavaExamples.Introduction;

public class expressionsStatementsBlocks {
    public static void main(String[] args) {
        
        //EXPRESIONS

        int score; 
        score = 90; //expression which return int

        Double a = 2.2, b = 3.4, result;
        result = a + b - 3.4; //expression which return double

        if (number1 == number2) //expression which return boolean value
        System.out.println("Number 1 is larger than number 2"); //string expression

        //STATEMENTS
        //statement is a complete unit of execution
        int score = 9*5;
        //expressions are part of statement in Java

        //expression statement

        // expression
        number = 10
        // statement
        number = 10;    //expression can be made statement by terminating it with ;

        // expression
        ++number
        // statement
        ++number;

        //declaration statement

        Double tax = 9.5;   //declares a variable tax which is initialized to 9.5

        //control flow statement
        //used in decision making and looping (covered later)

        //BLOCKS
        //block is a group of statements (zero or more) that is enclosed in curly braces { }
        
        String band = "Beatles";
        if (band == "Beatles") { // start of block
            System.out.print("Hey ");
            System.out.print("Jude!");
        } // end of block




    }
}
