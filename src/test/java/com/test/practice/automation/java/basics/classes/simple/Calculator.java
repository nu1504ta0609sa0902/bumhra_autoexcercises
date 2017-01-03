package com.test.practice.automation.java.basics.classes.simple;

/**
 * Created by TPD_Auto on 03/01/2017.
 */
public class Calculator {

    private final double n1;
    private final double n2;

    /**
     * This is a CONSTRUCTOR used to initialise an object
     *
     * In this case we need to supply 2 arguments to the CONSTRUCTOR to initialise
     * @param number1
     * @param number2
     */
    public Calculator(double number1, double number2){
        this.n1 = number1;
        this.n2 = number2;
    }

    public double add(){
        return n1 + n2;
    }

    public double subtract(){
        return n1 - n2;
    }


    /**
     * @Todo Aim: Add a method to perform division
     *  I have created a Calculator class which takes 2 numbers to initialise
     *
     *  Than added 2 methods: add() and subtract()
     *
     * 1. Create a new method to perform division
     */


    /**
     * @Todo Aim: Add a method to perform multiplication
     *  I have created a Calculator class which takes 2 numbers to initialise
     *
     *  Than added 2 methods: add() and subtract()
     *
     * 1. Create a new method to perform multiplication
     */


    /**
     * Tests our new super calculator
     * @param args
     */
    public static void main(String[] args){

        /**
         * @Todo Aim: Lets test the add() method
         * 1. Create a new Calculator object with the numbers 50 and 100
         * 2. Use calculator object to perform addition
         * 3. Check the value returned by add() is correct
         *  - If its correct than print out "Correct"
         *  - Else print out "I was expecting 150"
         */


        /**
         * @Todo Aim: Lets test the subtract() method
         * 1. Create a new Calculator object with the numbers 100 and 100
         * 2. Use calculator object to perform subtraction
         * 3. Check the value returned by subtract() is correct
         *  - If its correct than print out "Correct"
         *  - Else print out "I was expecting 0"
         */


        /**
         * @Todo Aim: Lets test the divide() method
         * 1. Create a new Calculator object with the numbers 100 and 10
         * 2. Use calculator object to perform division
         * 3. Check the value returned by divide() is correct
         *  - If its correct than print out "Correct"
         *  - Else print out "I was expecting 10"
         */


        /**
         * @Todo Aim: Lets test the multiplication() method
         * 1. Create a new Calculator object with the numbers 10 and 100
         * 2. Use calculator object to perform multiplication
         * 3. Check the value returned by multiplication() is correct
         *  - If its correct than print out "Correct"
         *  - Else print out "I was expecting 1000"
         */
    }
}
