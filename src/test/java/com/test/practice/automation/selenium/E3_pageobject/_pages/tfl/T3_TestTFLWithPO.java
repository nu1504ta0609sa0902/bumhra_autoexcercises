package com.test.practice.automation.selenium.E3_pageobject._pages.tfl;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by TPD_Auto on 24/01/2017.
 *
 * Write JUnit tests to perform all the tasks below
 *
 * Reuse the same browser
 *
 * - Use what you have learnt in the previous lessons
 */
public class T3_TestTFLWithPO {

    static WebDriver driver;
    private TFLHomePage tflHome;

    @BeforeClass
    public static void initialiseDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    public void setUpTestData(){
        tflHome = new TFLHomePage(driver);
    }


    /**
     * @todo Aim: Use Page Objects, Go to TFL perform a journey planner search, use InternetExplorer driver
     *
     * 1. Open InternetExplorer browser and go to TFL Journey Planner : https://tfl.gov.uk/plan-a-journey/
     * 2. Perform a search USING the "Tfl Journey Planner"
     *      - DONT SELECT FROM AUTO SUGGESTS FOR THIS EXERCISE
     *      - Enter from station : Seven Sisters
     *      - Enter to station  : Paddington
     *      - Click plan a journey button
     * 4. Verify disambiguation page is displayed
     *  - Verify there is a message : We found more than one location matching 'Seven Sisters'
     */


    /**
     * @todo Aim: Use Page Objects, Go to TFL perform a journey planner search, use InternetExplorer driver
     *
     * 1. Open InternetExplorer browser and go to TFL Journey Planner : https://tfl.gov.uk/plan-a-journey/
     * 2. Perform a search USING the "Tfl Journey Planner"
     *      - Enter from station : Seven
     *          - SELECT AN OPTION FROM AUTO SUGGESTS
     *      - Enter to station  : Paddington
     *          -  DONT SELECT FROM AUTO SUGGESTS FOR THIS EXERCISE
     *      - Click plan a journey button
     * 4. Verify disambiguation page is displayed
     *  - Verify there is a message : We found more than one location matching 'Paddington'
     */
    @Test
    public void verifyDisambiguationIsDisplayed(){
        tflHome = tflHome.gotoJourneyPlannerPage();
        //Enter from station
        boolean isFromStation = true;
        tflHome.selectFromAutoSuggestionsDD(isFromStation, "Seven Sisters Under" );
        tflHome.selectFromAutoSuggestionsDD(false, "Paddington" );
        System.out.println();
    }


    /**
     * @todo Aim: Use Page Objects, Go to TFL perform a journey planner search, use InternetExplorer driver
     *
     * 1. Open InternetExplorer browser and go to TFL Journey Planner : https://tfl.gov.uk/plan-a-journey/
     * 2. Perform a search USING the "Tfl Journey Planner"
     *      - Enter from station : Kings
     *          - SELECT "Seven Kings Rail Station" FROM AUTO SUGGESTS
     *      - Enter to station  : Paddington
     *          - SELECT "Paddington" FROM AUTO SUGGESTS
     *      - Click plan a journey button
     * 4. Verify List of Journeys are displayed for the journey "Seven Kings Rail Station" to "Paddington"
     *  - View and check the start and end station displayed in the results is correct
     */
}
