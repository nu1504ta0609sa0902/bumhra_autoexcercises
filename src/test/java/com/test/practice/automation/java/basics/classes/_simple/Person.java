package com.test.practice.automation.java.basics.classes._simple;

/**
 * Created by TPD_Auto on 15/12/2016.
 * <p>
 * Overall Aim: Learn to understand Class, Variables/Properties and Objects
 * <p>
 * Learn to differentiate access modifiers. public, private, protected
 * public int age = 20;                    //Visible in every package
 * protected String month = "December";    //Visible within current package or via inheritance
 * private double weeklySalary = 190.50;   //Only visible in current class
 * int numberOfWeeksPerYear = 52;          //Current package only
 */
public class Person {

    /**
     * @Todo Aim: Add at least 3 variables for Person, I have added firstName
     * 1. Think of anything related to a Person and add them as variables
     */
    private String firstName;   //Access modifier is private: we don't want this property accessible from everywhere

    /**
     * CONSTRUCTOR : IGNORE FOR NOW
     * <p>
     * We use this to initialise Person objects with a firstName
     *
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

    /**
     * ENTRANCE TO YOUR PROGRAM, ONLY NEEDED IN THE EARLY PHASE OF LEARNING
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * @Todo Aim: Able to create object with firstName set to what you pass into the constructor
         *  I have created a Person object called p1 and set the firstName to "Noor"
         *  REMEMBER p1 is just a variable it can be called something more meaningful like "noor"
         *
         * 1. Create a new Person object with your firstName
         * 2. Print out your firstName to console
         */
        Person p1 = new Person("Noor");
        String noorFirstName = p1.getFirstName();
        System.out.println(noorFirstName);


        /**
         * @Todo Aim: Able to change firstName to something else
         *
         * 1. Using the Person object created above (p1) change the value of firstName to something else
         *  - use the setFirstName() method
         * 2. Print out your firstName to console
         * 3. It should be different from the initial value "Noor"
         */


        /**
         * @Todo Aim: Able to create object and use the properties defined
         * 1. If you haven't done so already add property called lastName
         * 2. Create a new method which will return your lastName e.g getLastName()
         * 3. Create a new Person object with your firstName
         * 4. Print out your lastName to console
         *  - It should be empty because you have not set it yet
         * 5. Create a new method to set the lastName
         *  - call it something like setLastName and it should take String as an argument
         */


        /**
         * @Todo Aim: Able to change lastName to something else
         *
         * 1. Using the Person object created above change the value of lastName to something else
         * 2. Print out your lastName to console
         * 3. It should be different from the initial value you set above
         */
    }
}
