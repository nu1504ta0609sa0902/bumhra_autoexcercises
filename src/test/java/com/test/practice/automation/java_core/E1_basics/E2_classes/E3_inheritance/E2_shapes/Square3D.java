package com.test.practice.automation.java_core.E1_basics.E2_classes.E3_inheritance.E2_shapes;

/**
 * Created by TPD_Auto on 16/12/2016.
 */
public class Square3D extends _Shape{

    private double height;

    public Square3D(double width, double length) {
        super(width, length);
    }

    public double volume(){
        return area() * height;
    }

    /**
     * ENTRANCE TO YOUR PROGRAM, ONLY NEEDED IN THE EARLY PHASE OF LEARNING
     * @param args
     */
    public static void main(String[] args){
        /**
         * @Todo Aim: Understand the usage of inherited methods and variables
         * 1. Create a new Square3D object, set the width and height
         * 2. Print the width and height of the shape
         * 3. Calculate the VOLUME = (AREA * height) of the shape and print to console
         */
        System.out.println("\n---------------New Exercise---------------\n");
    }
}
