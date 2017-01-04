package com.test.practice.automation.java_core.E1_basics.E2_classes.E3_inheritance.E1_cars;

/**
 * Created by TPD_Auto on 15/12/2016.
 *
 * Overview: Learn about starter, variables, methods, access modifiers and E3_inheritance
 *
 * Learn to differentiate different access modifiers. public, private, protected
     public int age = 20;                    //Visible in every package
     protected String month = "December";    //Visible within current package or via E3_inheritance
     private double weeklySalary = 190.50;   //Only visible in current class
     int numberOfWeeksPerYear = 52;          //Current package only
 */
public class _Car {

    //We will mostly use public/private access modifiers
    public int numberOfWheels;      //Access modifier is public : accessible everywhere
    public String name;
    protected int numberOfSeats;    //Access modifier is protected : current class and E3_inheritance
    private int numberOfDoors;      //Access modifier is private : only accessible to current class
    String colour;                    //No Access modifier also know as default access modifier : current package only


}
