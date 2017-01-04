package com.test.practice.automation.java_core.E2_intermediate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by TPD_Auto on 03/01/2017.
 */
public class ReadNumbers {


    public static void main(String[] args) {

        Double number = getNumber();

        /**
         * @Todo Aim: Read a number from console
         *
         * 1. Read a number
         * 2. Print to the screen
         */
        System.out.println("\n---------------New Exercise---------------\n");


        /**
         * @Todo Aim: Using a for loop read 5 numbers and add it all up
         *
         * 1. Using a for loop Read 5 numbers and print the sum
         *  - each time we add a number to the previous total, print the sum to console
         */
        System.out.println("\n---------------New Exercise---------------\n");


        /**
         * @Todo Aim: Using a for loop read 5 numbers and only add the number if its an EVEN number
         *
         * 1. Using a for loop Read 5 numbers and print the sum
         *  - each time we add a number to the previous total, print the sum to console
         *  - remember to only add even numbers
         */
        System.out.println("\n---------------New Exercise---------------\n");


        /**
         * @Todo Aim: Using a for loop read 5 numbers and only add the number if its an ODD number
         *
         * 1. Using a for loop Read 5 numbers and print the sum
         *  - each time we add a number to the previous total, print the sum to console
         *  - remember to only add ODD numbers
         */
        System.out.println("\n---------------New Exercise---------------\n");



    }

    /**
     * This is a very basic reader
     * @return
     */
    private static Double getNumber() {
        //The line below will read from console
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String someValue = reader.readLine();
            double v = Double.parseDouble(someValue);
            return v;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0.0;
    }

}
