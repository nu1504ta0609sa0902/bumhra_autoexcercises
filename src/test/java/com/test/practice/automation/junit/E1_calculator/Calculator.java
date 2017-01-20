package com.test.practice.automation.junit.E1_calculator;

/**
 * Created by TPD_Auto on 03/01/2017.
 */
public class Calculator {

    private final double n1;
    private final double n2;

    /**
     * This is a CONSTRUCTOR used to initialise an object
     *
     * @param number1
     * @param number2
     */
    public Calculator(double number1, double number2){
        this.n1 = number1;
        this.n2 = number2;
    }

    public double add(){
        return n1 + n2;
    }

    public double subtract(){
        return n1 - n2;
    }

}
