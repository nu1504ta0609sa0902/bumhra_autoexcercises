package com.test.practice.automation.selenium.E1_direct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.BrowserConfig;

/**
 * Created by TPD_Auto on 20/01/2017.
 */
public class SeleniumExample1 {
    public static final String C_SELENIUM_LOCATION = "C:\\Selenium\\";

    public static void main(String[] args){

        //Open google chrome driver
        System.setProperty("webdriver.chrome.driver", C_SELENIUM_LOCATION + "chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://tfl.gov.uk";
        String expectedTitle = "Keeping London moving - Transport for London";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();
    }
}
