package com.test.practice.automation.selenium.E2_junit;

/**
 * Created by TPD_Auto on 24/01/2017.
 *
 * Write JUnit tests to perform all the tasks below
 *
 * - Use what you have learnt in the previous lessons
 */
public class T3_TestTFLWebsite {


    /**
     * @todo Aim: Goto TFL perform a journey planner search, use InternetExplorer driver
     *
     * 1. Open InternetExplorer browser and go to TFL Journey Planner : https://tfl.gov.uk/plan-a-journey/
     * 2. Perform a search USING the "Tfl Journey Planner"
     *      - DONT SELECT FROM AUTO SUGGESTS FOR THIS EXERCISE
     *      - Enter from station : Seven Sisters
     *      - Enter to station  : Paddington
     *      - Click plan a journey button
     * 4. Verify there is a message : We found more than one location matching 'Seven Sisters'
     * 5. Close the browser
     */


    /**
     * @todo Aim: Goto TFL perform a journey planner search, use Google Chrome driver
     *
     * 1. Open Google Chrome browser and go to TFL Journey Planner : https://tfl.gov.uk/plan-a-journey/
     * 2. Perform a search USING the "Tfl Journey Planner"
     *      - Enter from station : Seven Sisters
     *          - SELECT AN OPTION FROM AUTO SUGGESTS
     *      - Enter to station  : Paddington
     *          -  DONT SELECT FROM AUTO SUGGESTS FOR THIS EXERCISE
     *      - Click plan a journey button
     * 4. Verify there is a message : We found more than one location matching 'Paddington'
     * 5. Close the browser
     */


    /**
     * @todo Aim: Goto TFL perform a journey planner search, use Firefox driver
     *
     * 1. Open Firefox browser and go to TFL Journey Planner : https://tfl.gov.uk/plan-a-journey/
     * 2. Perform a search USING the "Tfl Journey Planner"
     *      - Enter from station : Seven Sisters
     *          - SELECT AN OPTION FROM AUTO SUGGESTS
     *      - Enter to station  : Paddington
     *          - SELECT AN OPTION FROM AUTO SUGGESTS
     *      - Click plan a journey button
     * 4. Verify List of Journeys are displayed for the journey "Seven Sisters" to "Paddington"
     * 5. Close the browser
     */
}
