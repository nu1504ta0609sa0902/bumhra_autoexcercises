package com.test.practice.automation.java.basics.classes.inheritance.cars;

/**
 * Created by TPD_Auto on 16/12/2016.
 *
 * Ford is-A Car
 */
public class Ford extends _Car {

    private String specialFordProperty;

    public static void main(String[] args){

        /**
         * @Todo Aim: Try and understand the different access modifiers
         * 1. Print out the variables defined in the Car class
         * 2. Try to print all the properties and take down notes on which ones are visible and why (Its to do with Access Modifiers)
         * 3. Try to view the property called numberOfDoors defined in _Car class
         *  - _Car is also known as parent class
         * 4. Try to view the property called colour
         *  - We can access colour but remember the Peugeot class can't access colour.
         */
        System.out.println("\n---------------New Exercise---------------\n");
        Ford ford = new Ford();
        System.out.println(ford.specialFordProperty);


        /**
         * @Todo Aim: Try and understand that Ford is also a car
         * 1. So we can assign the Ford object to a car class
         * 2. Try using fordIsACar object to access the specialFordProperty
         */
        System.out.println("\n---------------New Exercise---------------\n");
        _Car fordIsACar = new Ford();

    }
}
