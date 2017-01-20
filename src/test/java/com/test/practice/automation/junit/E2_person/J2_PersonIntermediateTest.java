package com.test.practice.automation.junit.E2_person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by TPD_Auto on 03/01/2017.
 */
public class J2_PersonIntermediateTest {

    /**
     * @Todo Aim: Create setup method using the annotation @Before
     *
     * @Before : methods will run before each and every tests
     *
     * 1. Create a new Person object with the firstName set to "Colly"
     */

    /**
     * @Todo Aim: Create tearDown method using the annotation @After
     *
     * @After : methods will run after each and every tests
     *
     * 1. Set the Person object to null
     */

    /**
     * @Todo Aim: NOTICE NO MAIN METHOD
     *
     * Remember to use setup and teardown methods
     *  - @Before and @After
     *
     * 1. And then assert the value is correct
     */
    @Test
    public void testFirstName(){

    }


    /**
     * @Todo Aim: Able to change firstName to something else
     *
     * Remember to use setup and teardown methods
     *  - @Before and @After
     *
     * 1. change the firstName
     *  - use the setFirstName() method
     * 2. Verify firstName is different from what you initiated the object with
     *  - It should be different from the initial value
     */
    @Test
    public void testUpdateFirstName(){

    }


    /**
     * @Todo Aim: Able to create object and use the properties defined
     *
     * 1. Verify lastName is null
     */


    /**
     * @Todo Aim: Able to change lastName to something else
     *
     * 1. Verify lastName updated correctly
     * 2. It should be different from default
     */

}
