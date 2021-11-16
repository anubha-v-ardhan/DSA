package com.anubhav;

public class PassingExample {
    public static void main(String[] args) {

        String name = "Anubhav";
        changeName(name);       // when name is passed in this method, the value of reference variable is passed
                                // In Java, we don't have such thing as pass by reference, there is only pass by value
                                // A copy of value of reference variable is passed
                                // So, refernce variable, naam is a copy of reference variable, name, both name and naam points to "Anubhav Vardhan"
        System.out.println(name);
    }

    static void changeName(String naam) {

        naam = "Hrishab";       // Not changing, creating a new object
                                // naam was earlier pointing to Anubhav but now its pointing to Hrishab but in main()
                                //      we are still printing name which is still Anubhav
                                // We can also not print naam in main() because it is only available in changeName() function
                                //                          (scope of function)
    }


    // Now we understand why swapping value of variables or changing name codes in PassProblem.java didn't work
}
