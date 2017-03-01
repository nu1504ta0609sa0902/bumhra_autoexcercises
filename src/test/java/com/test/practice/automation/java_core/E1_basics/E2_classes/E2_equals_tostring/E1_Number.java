package com.test.practice.automation.java_core.E1_basics.E2_classes.E2_equals_tostring;

/**
 * Created by TPD_Auto on 04/01/2017.
 */
public class E1_Number {

    private final Integer number;

    public E1_Number(int number) {
        this.number = number;
    }

//    @Override
//    public boolean equals(Object o) {
//        E1_Number number1 = (E1_Number) o;
//        return number.equals(number1.number);
//
//    }
//
//
//    @Override
//    public String toString() {
//        return number.toString();
//    }

    public static void main(String[] args) {

        /**
         * @Todo Aim: Understand why we need to override toString()
         *
         * 1. I have created a new E1_Number object with value of 1
         * 2. Run the program and observe:
         * - Notice it prints out something like com.test.practice.automation.java_core.E1_basics.E2_classes.E2_equals_tostring.Number@6d6f6e28
         * - This is not what we are expecting
         * - That is because the default version of toString() simply prints out the memory location of the object
         *
         * 3. I have overridden the toString() method, which is commented out
         *  - Uncomment it and rerun the program
         *  - Take notes as you will need it
         */
        System.out.println("\n---------------New Exercise---------------\n");
        E1_Number n = new E1_Number(1);
        System.out.println("1. Number is : " + n);


        /**
         * @Todo Aim: Understand why we need to override equals()
         *
         * 1. I have created a new E1_Number object with value of 1
         * 2. Run the program and observe:
         * - Notice it prints out the correct number now
         *      - Assuming you have uncommented toString()
         * - This is what we are expecting "Number is 1"
         * - That is because the default version of toString() was overridden
         *
         * 3. When we compare n == n2 it
         *  - Doesn't print "They are the same"
         *  - This is because the default equals() compares memory address of the object
         *      - Instead of the actual number
         *
         * 4. I have overriden the equals(), which is commented out
         *  - Uncomment it and rerun the program
         *  - Take notes as you will need it
         */
        System.out.println("\n---------------New Exercise---------------\n");
        E1_Number n2 = new E1_Number(1);
        System.out.println("\n2. Number is : " + n2);

        if (n.equals(n2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("Well how come they are not the same");
        }

    }
}
