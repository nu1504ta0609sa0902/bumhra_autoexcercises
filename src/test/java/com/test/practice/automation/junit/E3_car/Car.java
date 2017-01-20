package com.test.practice.automation.junit.E3_car;

/**
 * Created by TPD_Auto on 15/12/2016.
 */
public class Car {

    /**
     * @Todo Aim: Add at least 3 variables for Car, I have added make
     * 1. Think of anything related to a Car and add them as variables
     */
    private String make;

    /**
     * CONSTRUCTOR : We use this to initialise Car objects with a make, model, colour
     */
    public Car(String make, String model, String colour) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String value) {
        this.make = value;
    }

}
