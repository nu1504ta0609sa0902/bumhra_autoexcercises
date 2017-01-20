package com.test.practice.automation.junit.E3_car;

import org.junit.Test;

/**
 * Created by TPD_Auto on 03/01/2017.
 */
public class J2_CarIntermediateTest {


    /**
     * @Todo Aim: Create setup method using the annotation @Before
     *
     * @Before : methods will run before each and every tests
     *
     * 1. Create a new Car object with default constructor
     */

    /**
     * @Todo Aim: Create tearDown method using the annotation @After
     *
     * @After : methods will run after each and every tests
     *
     * 1. Set the Car object to null
     */

    /**
     * @Todo Aim: Verify the instance variable called make, NOTICE NO MAIN METHOD
     *
     * 1. And then assert the make is correct
     */
    @Test
    public void testMake(){
    }


    /**
     * @Todo Aim: Verify the instance variable called model
     *
     * 1. Verify model values is null
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
     * 1. Verify colour values is null
     * 2. change the colour to something of your choice
     *  - use the setColour() method
     * 3. Verify colour is different from what you initiated the object with
     */
    @Test
    public void testColour(){
    }



}
