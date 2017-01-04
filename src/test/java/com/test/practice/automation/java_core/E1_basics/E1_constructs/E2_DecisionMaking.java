package com.test.practice.automation.java_core.E1_basics.E1_constructs;

/**
 * Created by TPD_Auto on 15/12/2016.
 *
 * Overall Aim: Learn to use if/else statements
 *
 * Once you've learnt if/else you will need to investigate how to use "switch"
 */
public class E2_DecisionMaking {

    public static int age = 20;                    //Visible in every package
    protected static String month = "December";    //Visible within current package or via E3_inheritance
    private static double weeklySalary = 190.50;   //Only visible in current class
    static int numberOfWeeksPerYear = 52;          //Current package only

    public static void main(String[] args){

        /**
         * @Todo Aim: Simple decision making
         * 1. if "weeklySalary" is less than 200 than print out "Low income ..."
         * 2. if "numberOfWeeksPerYear" is greater than or equal to 50 than print out "Take a break ..."
         * 3. if "month" is equal to "December" than print out "Merry Christmas ..."
         * 4. if "age" is greater than or equal to 20 than print out "You look terrible ..."
         */
        System.out.println("\n---------------New Exercise---------------\n");



        /**
         * @Todo Aim: Simple decision making part 2
         * 1. if "weeklySalary" is more than or equal to 200 than print out "Life is better now ..." else print "Low income ..."
         * 2. if "numberOfWeeksPerYear" is less than 46 than print out "Keep working hard ..." else print "Take a break"
         * 3. if "month" is equal to "April" than print out "New tax year ..." else print "Its not April"
         * 4. if "age" is greater than or equal to 25 than print out "You look great ..." else print "You look terrible"
         */
        System.out.println("\n---------------New Exercise---------------\n");
        age = 25;
        weeklySalary = 250.50;
        numberOfWeeksPerYear = 45;
        month = "April";

    }
}
