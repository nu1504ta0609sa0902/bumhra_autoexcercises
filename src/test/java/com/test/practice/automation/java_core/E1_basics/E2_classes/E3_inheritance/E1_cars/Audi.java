package com.test.practice.automation.java_core.E1_basics.E2_classes.E3_inheritance.E1_cars;

/**
 * Created by TPD_Auto on 16/12/2016.
 *
 * Audi is-A Car
 * But not every car is an Audi
 */
public class Audi extends _Car {

    private String specialAudiProperty;

    public static void main(String[] args){

        /**
         * @Todo Aim: Try and understand the different access modifiers
         * 1. Print out the variables defined in the Car class
         * 2. Try to print all the properties and take down notes on which ones are visible and why (Its to do with Access Modifiers)
         * 3. Try to view the property called numberOfDoors defined in _Car class
         *  - _Car is also known as parent class
         * 4. Try to view the property called colour
         *  - We can access colour but remember the Peugeot class can't access colour.
         *
         *  PRINT OUT WHAT YOU HAVE LEARNT
         */
        System.out.println("\n---------------New Exercise---------------\n");
        Audi audi = new Audi();
        System.out.println(audi.name);
        System.out.println(audi.numberOfWheels);


        /**
         * @Todo Aim: Try and understand that Audi is also a car
         * 1. So we can assign the Audi object to a car class
         * 2. Try using audiIsACar object to access the specialAudiProperty
         */
        System.out.println("\n---------------New Exercise---------------\n");
        _Car audiIsACar = new Audi();
    }
}
