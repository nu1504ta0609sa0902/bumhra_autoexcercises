package com.test.practice.automation.java.basics.classes.simple;

/**
 * Created by TPD_Auto on 15/12/2016.
 *
 * Overall Aim: Learn to understand Class, Variables/Properties and Objects
 *
 * Learn to differentiate different access modifiers. public, private, protected
    public static int age = 20;                    //Visible in every package
    protected static String month = "December";    //Visible within current package or via inheritance
    private static double weeklySalary = 190.50;   //Only visible in current class
    static int numberOfWeeksPerYear = 52;          //Current package only
 */
public class Person {

    /**
     * @Todo Aim: Add at least 3 variables for Person, I have added firstName
     * 1. Think of anything related to a Person and add them as variables
     */
    private String firstName;   //Access modifier is private: we don't want this property accessible from everywhere

    /**
     * CONSTRUCTOR : IGNORE FOR NOW
     *
     * We use this to initialise Person objects with a firstName
     * @param firstName
     */
    public Person(String firstName){
        this.firstName = firstName;
    }


    public String getFirstName(){
        return firstName;
    }

    /**
     * ENTRANCE TO YOUR PROGRAM, ONLY NEEDED IN THE EARLY PHASE OF LEARNING
     * @param args
     */
    public static void main(String[] args){

        /**
         * @Todo Aim: Able to create objects from starter
         *  I have created a Person object called p1 and set the firstName to "Noor"
         *  REMEMBER p1 is just a variable it can be called something more meaningful like "noor"
         * 1. Create a new Person object with your firstName
         * 2. Print out your firstName to console
         */
        Person p1 = new Person("Noor");
        String noorFirstName = p1.getFirstName();
        System.out.println(noorFirstName);


        /**
         * @Todo Aim: Able to create objects from starter, add and use the properties defined
         * 1. If you haven't done so already add property called lastName
         * 2. Create a new method which will return your lastName e.g getLastName()
         * 3. Print out your lastName to console
         */
    }
}
