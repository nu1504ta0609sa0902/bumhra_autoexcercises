package com.test.practice.automation.junit.E3_car;

import com.test.practice.automation.junit.E2_person.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by TPD_Auto on 03/01/2017.
 */
public class J1_CarBasicTest {


    /**
     * @Todo Aim: Verify the instance variable called make, NOTICE NO MAIN METHOD
     *
     * 1. I create a new Car object with default constructor
     * 2. And then assert the make is correct
     */
    @Test
    public void testMake(){
    }


    /**
     * @Todo Aim: Verify the instance variable called model
     *
     * 1. I create a new Car object with default constructor
     *  - Verify model values is null
     * 2. change the model to something of your choice
     *  - use the setModel() method
     * 3. Verify model is different from what you initiated the object with
     */
    @Test
    public void testModel(){
    }


    /**
     * @Todo Aim: Able to create object and use the properties defined
     *
     * 1. I create a new Car object with default constructor
     *  - Verify colour values is null
     * 2. change the colour to something of your choice
     *  - use the setColour() method
     * 3. Verify colour is different from what you initiated the object with
     */
    @Test
    public void testColour(){
    }


}
