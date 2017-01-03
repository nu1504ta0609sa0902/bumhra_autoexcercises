package com.test.practice.automation.java.basics.classes.inheritance.shapes;

/**
 * Created by TPD_Auto on 16/12/2016.
 */
public class _Shape {
    public double width;
    public double length;

    public _Shape(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double area(){
        return width * length;
    }

}
