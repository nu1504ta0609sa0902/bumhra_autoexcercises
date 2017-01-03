package com.test.practice.automation.java.intermediate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by TPD_Auto on 03/01/2017.
 */
public class ReadTexts {


    public static void main(String[] args) {

        String lineOfText = getLineOfText();

        /**
         * @Todo Aim: Read a line of text from console
         *
         * 1. Read a line of text
         * 2. Print to the screen
         */


        /**
         * @Todo Aim: Using a for loop read 5 line of texts and append all the lines
         *
         * 1. Using a for loop Read 5 line of texts and print the lines
         *  - each time we enter a line of text to the previous lines, print the lines to console
         */


        /**
         * @Todo Aim: Using a for loop read 5 line of texts and only add the line of text if it contains VOWEL
         *
         * 1. Using a for loop Read 5 line of texts and print the lines
         *  - each time we enter a line of text to the previous lines, print the lines to console
         *  - remember to only append line of texts with vowel
         */


        /**
         * @Todo Aim: Using a for loop read 5 line of texts and only add the line of text if it doesn't contain VOWEL
         *
         * 1. Using a for loop Read 5 line of texts and print the lines
         *  - each time we enter a line of text to the previous lines, print the lines to console
         *  - remember to only append line of texts with no VOWEL
         */



    }


    private static String getLineOfText() {
        //The line below will read from console
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String someValue = reader.readLine();
            return someValue;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
