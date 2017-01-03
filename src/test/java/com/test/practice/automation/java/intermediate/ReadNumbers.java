package com.test.practice.automation.java.intermediate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by TPD_Auto on 03/01/2017.
 */
public class ReadNumbers {


    public static void main(String[] args) {

        //The line below will read from console
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String someValue = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * @Todo Aim:
         */

    }
}
