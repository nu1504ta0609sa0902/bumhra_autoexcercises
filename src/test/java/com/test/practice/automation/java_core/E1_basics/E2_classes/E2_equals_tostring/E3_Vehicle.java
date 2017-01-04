package com.test.practice.automation.java_core.E1_basics.E2_classes.E2_equals_tostring;

/**
 * Created by TPD_Auto on 04/01/2017.
 */
public class E3_Vehicle {

    private String make;
    private String model;
    private String year;

    public E3_Vehicle(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {

        /**
         * @Todo Aim: Understanding of why we need to override toString()
         *
         * 1. Create a new Vehicle object call it v1
         *  - make = Ford, model = Focus , year = 2005
         * 2. Run the program and observe:
         * - Notice it prints out something like com.test.practice.automation.java_core.E1_basics.E2_classes.E2_equals_tostring.E3_Vehicle@6d6f6e28
         * - This is not what we are expecting
         * - That is because the default version of toString() simply prints out the memory location of the object
         *
         * 3. YOU need to implement the toString() method
         *  - Make sure the toString() method displays all the properties
         *      - make, model and year
         */
        System.out.println("\n---------------New Exercise---------------\n");



        /**
         * @Todo Aim: Understanding of why we need to override equals()
         *
         * 1. Create a new Vehicle object call it v2
         *  - make = Ford, model = Focus , year = 2005
         *
         * 2. Run the program and observe:
         * - Notice it prints out the correct make, model and year
         *      - Assuming you have implemented the toString()
         *
         * 3. When we compare v1 == v2 it
         *  - Doesn't print "They are the same"
         *  - This is because the default equals() compares memory address of the object
         *      - Instead of the actual model, make, year
         *
         *      if (COMPARE THE OBJECTS HERE) {
                    System.out.println("They are the same");
                    } else {
                    System.out.println("Well how come they are not the same");
                    }
         *
         * 4. YOU need to implement the equals() method
         *  - To compare object values and verify they are the same
         */
        System.out.println("\n---------------New Exercise---------------\n");




        /**
         * @Todo Aim: Understanding of why we need to override equals() part 2
         *
         * 1. Create a new Vehicle object call it v3
         *  - make = Ford, model = Focus , year = 2015
         *
         * 2. Run the program and observe:
         * - Notice it prints out the correct make, model and year
         *      - Assuming you have implemented the toString()
         *
         * 3. When we compare v1 == v3 it
         *  - Should print "They are NOT the same"
         *  - Note the year is 2015
         */
        System.out.println("\n---------------New Exercise---------------\n");
    }
}
