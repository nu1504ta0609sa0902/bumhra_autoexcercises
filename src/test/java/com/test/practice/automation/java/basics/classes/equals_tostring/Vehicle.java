package com.test.practice.automation.java.basics.classes.equals_tostring;

/**
 * Created by TPD_Auto on 04/01/2017.
 */
public class Vehicle {

    private String make;
    private String model;
    private String year;


    public static void main(String[] args) {

        /**
         * @Todo Aim: Understand why we need to override toString()
         *
         * 1. I have created a new Name object with value of "Noor"
         * 2. Run the program and observe:
         * - Notice it prints out something like com.test.practice.automation.java.basics.classes.equals_tostring.Name@6d6f6e28
         * - This is not what we are expecting
         * - That is because the default version of toString() simply prints out the memory location of the object
         *
         * 3. I have overridden the toString() method, which is commented out
         *  - Uncomment it and rerun the program
         *  - Take notes as you will need it
         */
        System.out.println("\n---------------New Exercise---------------\n");
        Name name1 = new Name("Noor");
        System.out.println("1. Name is : " + name1);


        /**
         * @Todo Aim: Understand why we need to override equals()
         *
         * 1. I have created a new Name object with value of "Noor"
         * 2. Run the program and observe:
         * - Notice it prints out the correct name now
         *      - Assuming you have uncommented toString()
         * - This is what we are expecting "Name is : Noor"
         * - That is because the default version of toString() was overridden
         *
         * 3. When we compare n == n2 it
         *  - Doesn't print "They are the same"
         *  - This is because the default equals() compares memory address of the object
         *      - Instead of the actual name
         *
         * 4. I have overriden the equals(), which is commented out
         *  - Uncomment it and rerun the program
         *  - Take notes as you will need it
         */
        System.out.println("\n---------------New Exercise---------------\n");
        Name name2 = new Name("Noor");
        System.out.println("\n2. Name is : " + name2);

        if (name1.equals(name2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("Well how come they are not the same");
        }

    }
}
