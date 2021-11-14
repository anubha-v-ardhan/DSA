public class Main {
    /*
        class name is Main because file name is Main.java (different name will work if this class is not public tho)
        Java codes must contain atleast a class
        Things starting with capital are classes (this is a convention)
        access modifier is public here which means this class can be accessed
            from anywhere
    */

    /*
        public: this class is accessible from anywhere (access modifier)
        class: namegroup of properties and functions
        Main: name of public class (must be same a name of file)
    */

    public static void main(String[] args) {
        
        /*
            Code must contain a main function otherwise it won't run
            
            main: function is the entry point of program
            public: access modifier is public which means it is accessible from everywhere
            static: static are variables and functions that don't depend on a object
                since main function is the entry point of the program and nothing is running before it, how can we have an object
            void: return type of the function
                main function doesn't return any value
            (String[] args): command line arguments
                String[]: array (collection of Strings)
        */
        System.out.println("Hello World"); //print in java
        System.out.println(args[0]);
        // pass values from terminal like $java Main.java 30, it will print 30 which will go at 0 index of args array
        
        /*
            ➜  05-first-java-program git:(master) ✗ java Main.java 30
               30
               Hello World
            ➜  05-first-java-program git:(master) ✗ 
        */

        // best practice is source code goes in src folder and bytecode goes in the out folder
        
        /* 
            all the commands we write in terminal are actually executable files
            to know where the execuatble file is, do $where <command>
                if you are seeing <command> not found, make sure to add it in your path
            
            my computer knows where the execuatble file is located via PATH variables
            
        */

    }
}