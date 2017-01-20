package com.test.practice.automation.junit.E2_person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by TPD_Auto on 03/01/2017.
 */
public class J1_PersonBasicTest {


    /**
     * @Todo Aim: NOTICE NO MAIN METHOD
     *
     * 1. I create a new object with firstName set to "Noor"
     * 2. And then asset the value is correct
     */
    @Test
    public void testFirstName(){
        String myFirstName = "Noor";
        Person p1 = new Person(myFirstName);
        String firstName = p1.getFirstName();

        //Verify firstName is correct
        Assert.assertEquals(myFirstName, firstName);
    }


    /**
     * @Todo Aim: Able to change firstName to something else
     *
     * 1. Create a E2_person object with value "Colly"
     *  - Verify firstName set to "Colly"
     * 2. change the firstName
     *  - use the setFirstName() method
     * 3. Verify firstName is different from what you initiated the object with
     *  - It should be different from the initial value "Colly"
     */
    @Test
    public void testUpdateFirstName(){

    }


    /**
     * @Todo Aim: Able to create object and use the properties defined
     *
     * 1. Create a E2_person object and don't set the lastName
     * 2. Verify lastName is null
     */
    @Test
    public void testLastName(){

    }


    /**
     * @Todo Aim: Able to change lastName to something else
     *
     * 1. Create Person object and change the value of lastName to something else
     * 2. Verify lastName updated correctly
     * 3. It should be different from default
     */
    @Test
    public void testUpdateLastName(){

    }

}
