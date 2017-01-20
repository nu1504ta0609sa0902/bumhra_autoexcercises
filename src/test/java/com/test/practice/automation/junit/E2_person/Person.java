package com.test.practice.automation.junit.E2_person;

/**
 * Created by TPD_Auto on 15/12/2016.
 */
public class Person {

    /**
     * @Todo Aim: Add at least 3 variables for Person, I have added firstName
     * 1. Think of anything related to a Person and add them as variables
     */
    private String firstName;   //Access modifier is private: we don't want this property accessible from everywhere

    /**
     * CONSTRUCTOR : We use this to initialise Person objects with a firstName
     * @param firstName
     */
    public Person(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

}
